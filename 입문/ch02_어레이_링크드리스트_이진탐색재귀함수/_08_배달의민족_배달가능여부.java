package 입문.ch02_어레이_링크드리스트_이진탐색재귀함수;

import java.util.Arrays;
import java.util.HashSet;

public class _08_배달의민족_배달가능여부 {

    public static boolean isAvailableToOrder(String[] menus, String[] orders) {

        HashSet<String> menuHashSet=new HashSet<String>(Arrays.asList(menus));
        for(String menu:orders) {
            if(!menuHashSet.contains(menu)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] shopMenus = {"만두", "떡볶이", "오뎅", "사이다", "콜라"};
        String[] shopOrders = {"오뎅", "콜라", "만두"};
        
        boolean result = isAvailableToOrder(shopMenus, shopOrders);
        System.out.println(result);

        String[] shopMenus2 = {"만두", "떡볶이", "오뎅", "사이다", "콜라"};
        String[] shopOrders2 = {"오뎅", "콜라", "쿨피스"};
        
        boolean result2 = isAvailableToOrder(shopMenus2, shopOrders2);
        System.out.println(result2);

        String[] shopMenus3 = {"만두", "콜라","오뎅"};
        String[] shopOrders3 = {"오뎅", "콜라", "만두"};
        
        boolean result3 = isAvailableToOrder(shopMenus3, shopOrders3);
        System.out.println(result3);
    }
}
