package 입문.ch02_어레이_링크드리스트_이진탐색재귀함수;

public class _04_재귀함수1 {

    public static void countDown(int number) {
        if(number<0) {
            return;
        }
        System.out.println(number);
        countDown(number-1);
    }
    public static void main(String[] args) {
        countDown(60);
    }
}
