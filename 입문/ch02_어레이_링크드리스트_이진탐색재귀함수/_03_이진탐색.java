package 입문.ch02_어레이_링크드리스트_이진탐색재귀함수;

public class _03_이진탐색 {

    public static boolean isExistingTargetNumberBinary(int target, int[] array)
    {
        int currentMinIndex = 0;
        int currentMaxIndex = array.length - 1;
        int currentGuessIndex = (currentMinIndex + currentMaxIndex) / 2;
        
        int findCount = 0;
        
        while (currentMinIndex <= currentMaxIndex) {
            findCount += 1;
            if (array[currentGuessIndex] == target) {
                System.out.println(findCount);
                return true;
            } else if (array[currentGuessIndex] < target) {
                currentMinIndex = currentGuessIndex + 1;
            } else { // array[currentGuess] > target
                currentMaxIndex = currentGuessIndex - 1;
            }
            currentGuessIndex = (currentMinIndex + currentMaxIndex) / 2;
        }
        
        return false;
    }

    public static void main(String[] args) {
        int findingTarget = 14;
        int[] findingNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        
        boolean result = isExistingTargetNumberBinary(findingTarget, findingNumbers);
        System.out.println(result);
    
    }
}