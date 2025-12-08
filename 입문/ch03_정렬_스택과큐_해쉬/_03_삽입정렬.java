package 입문.ch03_정렬_스택과큐_해쉬;

import java.util.Arrays;

public class _03_삽입정렬 {
    public static void main(String[] args) {
        int[] input = {4, 6, 2, 9, 1};
        insertionSort(input);
        System.out.println("정답 = "+Arrays.toString(input));
        
        System.out.print("정답 = [1, 2, 4, 6, 9] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(insertionSort(new int[]{4, 6, 2, 9, 1})));
        
        System.out.print("정답 = [-1, 3, 9, 17] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(insertionSort(new int[]{3, -1, 17, 9})));
        
        System.out.print("정답 = [-3, 32, 44, 56, 100] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(insertionSort(new int[]{100, 56, -3, 32, 44})));


        System.out.print("정답 = [4, 5, 7, 7, 8] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(insertionSort(new int[]{5, 8, 4, 7, 7})));
    }

    public static int[] insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i - j] < array[i - j - 1]) {
                    int temp = array[i - j];
                    array[i - j] = array[i - j - 1];
                    array[i - j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        
        return array;
    }


}
