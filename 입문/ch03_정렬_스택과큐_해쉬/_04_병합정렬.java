package 입문.ch03_정렬_스택과큐_해쉬;

import java.util.Arrays;

public class _04_병합정렬 {

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        
        int mid = array.length / 2;
        int[] leftArray = Arrays.copyOfRange(array, 0, mid);
        int[] rightArray = Arrays.copyOfRange(array, mid, array.length);
        
        // System.out.println(Arrays.toString(array));
        // System.out.println(Arrays.toString(leftArray));
        // System.out.println(Arrays.toString(rightArray));

        return merge(mergeSort(leftArray),mergeSort(rightArray));
    }


    public static int[] merge(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int resultIndex = 0;
        int array1Index = 0;
        int array2Index = 0;
        
        while (array1Index < array1.length && array2Index < array2.length) {
            if (array1[array1Index] < array2[array2Index]) {
                result[resultIndex++] = array1[array1Index];
                array1Index++;
            } else {
                result[resultIndex++] = array2[array2Index];
                array2Index++;
            }
        }
        
        while (array1Index < array1.length) {
            result[resultIndex++] = array1[array1Index];
            array1Index++;
        }
        
        while (array2Index < array2.length) {
            result[resultIndex++] = array2[array2Index];
            array2Index++;
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println("merge(int[] array1, int[] array2) test:");
        int[] array_a = {1, 2, 3, 5};
        int[] array_b = {4, 6, 7, 8};
        System.out.println("정답 = "+Arrays.toString(merge(array_a, array_b)));

        System.out.println();
        System.out.println("public static int[] mergeSort(int[] array) test:");
        int[] array = {5, 3, 2, 1, 6, 8, 7, 4};
        System.out.println("정답 = "+Arrays.toString(mergeSort(array)));
        
        System.out.print("정답 = [-7, -1, 5, 6, 9, 10, 11, 40] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(mergeSort(new int[]{-7, -1, 9, 40, 5, 6, 10, 11})));
        
        System.out.print("정답 = [-1, 2, 3, 5, 10, 40, 78, 100] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(mergeSort(new int[]{-1, 2, 3, 5, 40, 10, 78, 100})));
        
        System.out.print("정답 = [-1, -1, 0, 1, 6, 9, 10] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(mergeSort(new int[]{-1, -1, 0, 1, 6, 9, 10})));
    }
}
