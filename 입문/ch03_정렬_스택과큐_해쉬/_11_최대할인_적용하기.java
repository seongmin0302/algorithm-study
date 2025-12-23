package 입문.ch03_정렬_스택과큐_해쉬;

import java.util.Arrays;
import java.util.Collections;

public class _11_최대할인_적용하기 {
    public static void main(String[] args) {
        
        System.out.println("정답 = 926000 / 현재 풀이 값 = " + 
            getMaxDiscountedPrice(new int[]{30000, 2000, 1500000}, new int[]{20, 40}));
        
        System.out.println("정답 = 485000 / 현재 풀이 값 = " + 
            getMaxDiscountedPrice(new int[]{50000, 1500000}, new int[]{10, 70, 30, 20}));
        
        System.out.println("정답 = 1550000 / 현재 풀이 값 = " + 
            getMaxDiscountedPrice(new int[]{50000, 1500000}, new int[]{}));
        
        System.out.println("정답 = 1458000 / 현재 풀이 값 = " + 
            getMaxDiscountedPrice(new int[]{20000, 100000, 1500000}, new int[]{10, 10, 10}));
    }

    public static int getMaxDiscountedPrice(int[] prices, int[] coupons) {
        Integer[] pricesBoxed=Arrays.stream(prices).boxed().toArray(Integer[]::new);
        Integer[] couponsBoxed=Arrays.stream(coupons).boxed().toArray(Integer[]::new);


        Arrays.sort(pricesBoxed,Collections.reverseOrder());
        Arrays.sort(couponsBoxed,Collections.reverseOrder());
        System.out.println(Arrays.toString(pricesBoxed));
        System.out.println(Arrays.toString(couponsBoxed));

        int discountedPriceSum=0;
        int priceIndex = 0;
        int couponIndex = 0;
        
        while (pricesBoxed.length>priceIndex && couponsBoxed.length>couponIndex) {
            discountedPriceSum+=pricesBoxed[priceIndex]*((100-couponsBoxed[couponIndex])/(double)100);
            priceIndex++;
            couponIndex++;
        }

        while(pricesBoxed.length>priceIndex) {
            discountedPriceSum+=pricesBoxed[priceIndex];
            priceIndex++;
        }
        
        return discountedPriceSum;
    }
}
