package 입문.ch02_어레이_링크드리스트_이진탐색재귀함수;

public class _06_회문검사 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("summuus"));
        System.out.println(isPalindrome("xabba"));
        System.out.println(isPalindrome("comcom"));
        System.out.println(isPalindrome("comwwtmoc"));
        System.out.println(isPalindrome("comwwmoc"));
        System.out.println(isPalindrome("abcdedcba"));
        System.out.println(isPalindrome("abcddcba"));
    }

    public static boolean isPalindrome(String string) {

        int index1=string.length()/2-1;
        int index2=string.length()-1;
        
        for(int i=0;i<=index1;i++) {
            if(!(string.charAt(i)==string.charAt(index2))) {
                return false;
            }

            index2--;
        }

        return true;


    }
}
