package 입문.ch03_정렬_스택과큐_해쉬;

import java.util.Stack;

public class _12_올바른괄호 {
    public static void main(String[] args) {
        System.out.println("정답 = true / 현재 풀이 값 = " + isCorrectParenthesis("(())"));
        System.out.println("정답 = false / 현재 풀이 값 = " + isCorrectParenthesis(")"));
        System.out.println("정답 = false / 현재 풀이 값 = " + isCorrectParenthesis("((())))"));
        System.out.println("정답 = false / 현재 풀이 값 = " + isCorrectParenthesis("())()"));
        System.out.println("정답 = false / 현재 풀이 값 = " + isCorrectParenthesis("((())"));
    }

    public static boolean isCorrectParenthesis(String string) {
        Stack<Character> stack=new Stack<>();
        for(char c:string.toCharArray()) {
            if(c=='(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
     }
}
