package 입문.ch02_어레이_링크드리스트_이진탐색재귀함수;

import java.util.ArrayList;

public class _09_더하거나빼거나_재귀 {

    static ArrayList<Integer> allWaysArrayList=new ArrayList<Integer>();

    public static int getCountOfWaysToTargetByDoingPlusOrMinus(int[] array,int targetNumber) {

        allWaysArrayList.clear();
        getAllWaysByDoingPlusOrMinus(array,0,0);
        System.out.println("모든 방법:"+allWaysArrayList);

        int count=0;

        for(int way:allWaysArrayList) {
            if(targetNumber==way) {
                count++;
            }
        }

        return count;
    }

    // currentIndex: 현재 보고 있는 인덱스
    // currentSum: currentIndex 이전까지의 합
    public static void getAllWaysByDoingPlusOrMinus(int[] array,int currentIndex,int currentSum) {

        System.out.println("currentIndex:"+currentIndex+", currentSum:"+currentSum);
        if(currentIndex==array.length) {
            allWaysArrayList.add(currentSum);
            return;
        }

        // currentSum+arr[currentIndex]: 이번 숫자를 더하거나(currentIndex의 값을 더하거나)
        getAllWaysByDoingPlusOrMinus(array,currentIndex+1, currentSum+array[currentIndex]); 
        // currentSum-arr[currentIndex]: 이번 숫자를 빼거나(currentIndex의 값을 빼거나)
        getAllWaysByDoingPlusOrMinus(array,currentIndex+1, currentSum-array[currentIndex]);

        //currentIndex+1: 위 두줄의 코드에서 공통적으로 쓰인 코드이다. 다음번에 더하나 뺄 숫자를 정해줘야된다.
    }
    public static void main(String[] args) {

        //문제1
        System.out.println("test1:");
        int[] numbers = {2,3,1};
        int targetNumber = 0;
        System.out.println("방법의 수:"+getCountOfWaysToTargetByDoingPlusOrMinus(numbers, targetNumber));


        // 문제2
        System.out.println();
        System.out.println("test2:");
        int[] numbers2 = {1, 1, 1, 1, 1};
        int targetNumber2 = 3;
        System.out.println("방법의 수:"+getCountOfWaysToTargetByDoingPlusOrMinus(numbers2, targetNumber2));
    }
}
