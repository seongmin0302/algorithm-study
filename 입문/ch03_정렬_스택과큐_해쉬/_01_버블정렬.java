package 입문.ch03_정렬_스택과큐_해쉬;

import java.util.Arrays;

public class _01_버블정렬 {
    public static void main(String[] args) {
        int[] input = {4, 6, 2, 9, 1};
        bubbleSort(input);
        System.out.println("정답 = "+Arrays.toString(input));
        
        System.out.print("정답 = [1, 2, 4, 6, 9] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(bubbleSort(new int[]{4, 6, 2, 9, 1})));
        
        System.out.print("정답 = [-1, 3, 9, 17] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(bubbleSort(new int[]{3, -1, 17, 9})));
        
        System.out.print("정답 = [-3, 32, 44, 56, 100] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(bubbleSort(new int[]{100, 56, -3, 32, 44})));
    }

    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) { // O(N)
            for (int j = 0; j < n - i - 1; j++) { // O(N)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

}
