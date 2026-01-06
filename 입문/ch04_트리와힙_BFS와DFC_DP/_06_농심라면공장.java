package 입문.ch04_트리와힙_BFS와DFC_DP;

import java.util.Collections;
import java.util.PriorityQueue;

class _06_농심라면공장 {
    public static int getMinimumCountOfOverseasSupply(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int lastAddedDateIndex = 0;
        // Max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        while (stock <= k) {

            System.out.println("current stock: "+stock);
            
            while (lastAddedDateIndex < dates.length && dates[lastAddedDateIndex] <= stock) {
                maxHeap.offer(supplies[lastAddedDateIndex]);
                lastAddedDateIndex += 1;
            }

            System.out.println("last Added Date Index: "+lastAddedDateIndex);
            System.out.println("max Heap: "+maxHeap);

            answer += 1;
            int heappop = maxHeap.poll();
            stock += heappop;

            System.out.println("after stock: "+stock);
            System.out.println(); 
        }

        return answer;
    }

    public static void main(String[] args) {
        // System.out.println("test1:");
        // System.out.println("정답 = 2 / 현재 풀이 값 = " + 
        //     getMinimumCountOfOverseasSupply(4, new int[]{4, 10, 15}, new int[]{20, 5, 10}, 30));

        // System.out.println();
        // System.out.println("test2:");
        // System.out.println("정답 = 4 / 현재 풀이 값 = " + 
        //     getMinimumCountOfOverseasSupply(4, new int[]{4, 10, 15, 20}, new int[]{20, 5, 10, 5}, 40));
        
        // System.out.println();
        // System.out.println("test3:");
        // System.out.println("정답 = 1 / 현재 풀이 값 = " + 
        //     getMinimumCountOfOverseasSupply(2, new int[]{1, 10}, new int[]{10, 100}, 11));

        System.out.println();
        System.out.println("test4:");
        System.out.println("정답 = 5 / 현재 풀이 값 = " +
            getMinimumCountOfOverseasSupply(4, new int[]{1, 4, 10, 15, 20}, new int[]{1, 20, 5, 10, 5}, 44));
    
    }
}
