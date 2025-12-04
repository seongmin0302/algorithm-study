package 입문.ch02_어레이_링크드리스트_이진탐색재귀함수;

public class _05_팩토리얼 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(5));

    }

    public static int factorial(int n) {
        if(n==1) {
            return 1;
        }
        return n*factorial(n-1);
    }
}
