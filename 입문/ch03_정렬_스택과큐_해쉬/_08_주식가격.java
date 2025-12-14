package 입문.ch03_정렬_스택과큐_해쉬;

import java.util.Arrays;

public class _08_주식가격 {
    public static void main(String[] args) {
        
        System.out.print("정답 = [4, 3, 1, 1, 0] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(getPriceNotFallPeriods(new int[]{1, 2, 3, 2, 3})));
        
        System.out.print("정답 = [6, 2, 1, 3, 2, 1, 0] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(getPriceNotFallPeriods(new int[]{3, 9, 9, 3, 5, 7, 2})));
        
        System.out.print("정답 = [6, 1, 4, 3, 1, 1, 0] / 현재 풀이 값 = ");
        System.out.println(Arrays.toString(getPriceNotFallPeriods(new int[]{1, 5, 3, 6, 7, 6, 5})));
    }

    public static int[] getPriceNotFallPeriods(int[] prices) {
        int[] result=new int[prices.length];
        for(int i=0;i<prices.length;i++) {
            int priceNotFallPeriod=0;
            for(int j=i+1;j<prices.length;j++) {
                if(prices[i]<=prices[j]) {
                    priceNotFallPeriod++;
                } else {
                    priceNotFallPeriod++;
                    break;
                }
            }

            result[i]=priceNotFallPeriod;
        }

        return result;
    }

}
