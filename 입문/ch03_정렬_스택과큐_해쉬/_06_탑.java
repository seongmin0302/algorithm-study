package 입문.ch03_정렬_스택과큐_해쉬;

import java.util.Arrays;

public class _06_탑 {
    public static void main(String[] args) {
        int[] top_heights = {6, 9, 5, 7, 4};
        System.out.println("정답 ="+Arrays.toString(getReceiverTopOrders(top_heights))); // [0, 0, 2, 2, 4] 가 반환되어야 한다!
        
        System.out.print("정답 = [0, 0, 2, 2, 4] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(getReceiverTopOrders(new int[]{6, 9, 5, 7, 4})));
        
        System.out.print("정답 = [0, 0, 2, 3, 3, 3, 6] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(getReceiverTopOrders(new int[]{3, 9, 9, 3, 5, 7, 2})));
        
        System.out.print("정답 = [0, 0, 2, 0, 0, 5, 6] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(getReceiverTopOrders(new int[]{1, 5, 3, 6, 7, 6, 5})));
    }

    public static int[] getReceiverTopOrders(int[] heights) {
        int[] result=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--) {
            for(int j=i-1;j>=0;j--) {
                if(heights[i]<=heights[j]) {
                    result[i]=j+1;
                    break;
                }
            }
        }

        return result;
    }
    
}
