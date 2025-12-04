package 입문.ch02_어레이_링크드리스트_이진탐색재귀함수;

public class _05_팩터리얼 {
    public static void main(String[] args) {
        int n=factorial(3);
        System.out.println(n);

        int n2=factorial(4);
        System.out.println(n2);

    }

    public static int factorial(int n) {
        if(n==1) {
            return 1;
        }
        return n*factorial(n-1);
    }
}
