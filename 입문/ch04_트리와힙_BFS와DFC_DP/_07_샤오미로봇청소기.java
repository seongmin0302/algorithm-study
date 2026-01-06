package 입문.ch04_트리와힙_BFS와DFC_DP;

import java.util.Queue;

class _07_샤오미로봇청소기 {

    // test1: 정답은 57 가 출력되어야 합니다!
    // private static int currentR = 7;
    // private static int currentC = 4;
    // private static int currentD = 0;
    // private static int[][] currentRoomMap = {
    //     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    //     {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    //     {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
    //     {1, 0, 0, 1, 1, 0, 0, 0, 0, 1},
    //     {1, 0, 1, 1, 0, 0, 0, 0, 0, 1},
    //     {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    //     {1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
    //     {1, 0, 0, 0, 0, 0, 1, 1, 0, 1},
    //     {1, 0, 0, 0, 0, 0, 1, 1, 0, 1},
    //     {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
    //     {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    // };

    // test2: 정답은 11 가 출력되어야 합니다!
    private static int currentR = 3;
    private static int currentC = 3;
    private static int currentD = 0;
    private static int[][] currentRoomMap = {
        {1, 1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0, 1},
        {1, 0, 1, 0, 0, 1},
        {1, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1}
    };
    
    // 북 동 남 서
    private static int[] dr = {-1, 0, 1, 0};
    private static int[] dc = {0, 1, 0, -1};

    public static int getDIndexWhenRotateToLeft(int d) {
        return (d + 3) % 4;
    }
    
    public static int getDIndexWhenGoBack(int d) {
        return (d + 2) % 4;
    }

    public static int getCountOfDepartmentsCleanedByRobotVacuum(int r, int c, int d, int[][] roomMap) {
        int n = roomMap.length;
        int m = roomMap[0].length;
        int countOfDepartmentsCleaned = 1;

        roomMap[r][c] = 2;
        Queue<int[]> queue = new java.util.LinkedList<>();
        queue.offer(new int[]{r, c, d});

        int step = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            r = current[0];
            c = current[1];
            d = current[2];
            int tempD = d;

            printCurrentPositionAndDirection(++step, r, c, d);

            for (int i = 0; i < 4; i++) {
                tempD = getDIndexWhenRotateToLeft(tempD); 
                int newR = r + dr[tempD];
                int newC = c + dc[tempD];

                if (0 <= newR && newR < n && 0 <= newC && newC < m && roomMap[newR][newC] == 0) {
                    countOfDepartmentsCleaned += 1;
                    roomMap[newR][newC] = 2;
                    queue.offer(new int[]{newR, newC, tempD});
                    break;
                }
                else if (i == 3) {
                    tempD = getDIndexWhenGoBack(d);
                    newR = r + dr[tempD];
                    newC = c + dc[tempD];

                    if (0 <= newR && newR < n && 0 <= newC && newC < m && roomMap[newR][newC] != 1) {
                        queue.offer(new int[]{newR, newC, d});
                        break;
                    } else {
                        return countOfDepartmentsCleaned;
                    }
                }
            }
        }
        
        return countOfDepartmentsCleaned;
    }

    private static String[] DIR_NAME = {"위", "아래", "오른쪽", "왼쪽"};

    public static void printCurrentPositionAndDirection(int step, int r, int c, int d) {
        System.out.printf("step%d - 현위치: roomMap[%d][%d], 바라보는 방향= %s%n", step, r, c, DIR_NAME[d]);
    }

    public static void main(String[] args) {
        System.out.println("정답: " + getCountOfDepartmentsCleanedByRobotVacuum(currentR, currentC, currentD, currentRoomMap));
    }
}