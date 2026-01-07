package 입문.ch04_트리와힙_BFS와DFC_DP;

import java.util.HashMap;
import java.util.Map;

class _08_CGV극장좌석_자리_구하기 {
    private static int seatCount = 9;
    private static int[] vipSeatArray = {4, 7};
    

    private static Map<Integer, Integer> memo = new HashMap<>();
    
    static {
        memo.put(1, 1);
        memo.put(2, 2);
    }

    public static int fiboDynamicProgramming(int n, Map<Integer, Integer> fiboMemo) {
        if (fiboMemo.containsKey(n)) {
            return fiboMemo.get(n);
        }

        int nthFibo = fiboDynamicProgramming(n - 1, fiboMemo) + fiboDynamicProgramming(n - 2, fiboMemo);
        fiboMemo.put(n, nthFibo);

        return nthFibo;
    }

    public static int getAllWaysOfTheaterSeat(int totalCount, int[] fixedSeatArray) {
        int allWays = 1;
        int currentIndex = 0;

        for (int fixedSeat : fixedSeatArray) {
            int fixedSeatIndex = fixedSeat - 1;

            System.out.println("currentIndex: "+currentIndex + ", fixedSeatIndex: "+fixedSeatIndex);

            int countOfWays = fiboDynamicProgramming(fixedSeatIndex - currentIndex, memo);
            allWays *= countOfWays;
            currentIndex = fixedSeatIndex + 1;
        }

        System.out.println("currentIndex: "+currentIndex);

        int countOfWays = fiboDynamicProgramming(totalCount - currentIndex, memo);
        allWays *= countOfWays;

        return allWays;
    }

    public static void main(String[] args) {
        // 12가 출력되어야 합니다!
        System.out.println("정답: " + getAllWaysOfTheaterSeat(seatCount, vipSeatArray));
    }
}
