package 입문.ch03_정렬_스택과큐_해쉬;

import java.util.Arrays;

public class _04_병합정렬 {
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
    }
}
