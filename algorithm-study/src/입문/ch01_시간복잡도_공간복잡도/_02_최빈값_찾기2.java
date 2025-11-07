package 입문.ch01_시간복잡도_공간복잡도;
import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class _02_최빈값_찾기2 {
    public static void main(String[] args) {
        System.out.println("정답 = i, 현재 풀이 값 =" + find_max_occurred_alphabet("hello my name is dingcodingco"));
        System.out.println("정답 = e, 현재 풀이 값 =" + find_max_occurred_alphabet("we love algorithm"));
        System.out.println("정답 = b, 현재 풀이 값 =" + find_max_occurred_alphabet("best of best youtube"));
    }

    public static char find_max_occurred_alphabet(String sentence)
    {
        char[] alphabets = {'a','b','c','d','e','f','g'
                           ,'h','i','j','k','l','m','n','o','p'
                           ,'q','r','s','t','u','v'
                           ,'w','x','y','z'}; //alphabetArray

        int max_count_alphabet=0; //maxOccrrence // 가장 많이 나온 알파벳의 빈도수
        char max_alphabet=alphabets[0]; // 가장 많이 나온 알파벳
 
        for(char alphabet:alphabets)
        {
            int alphabet_count=0; //occrrence
            
            for(int j=0;j<sentence.length();j++)
            {
                if(alphabet==sentence.charAt(j))
                {
                    alphabet_count++;
                }
            }
            
            if(max_count_alphabet<alphabet_count)
            {
                 max_count_alphabet=alphabet_count;
                 max_alphabet = alphabet;
            }
        }

        return max_alphabet;
            
    }
}






// import java.util.*;
// import java.lang.*;
// import java.io.*;

// // The main method must be in a class named "Main".
// class Main {
//     public static void main(String[] args) {
//         System.out.println("정답 = i, 현재 풀이 값 =" + find_max_occurred_alphabet("hello my name is dingcodingco"));
//         System.out.println("정답 = e, 현재 풀이 값 =" + find_max_occurred_alphabet("we love algorithm"));
//         System.out.println("정답 = b, 현재 풀이 값 =" + find_max_occurred_alphabet("best of best youtube"));
//     }

//     public static char find_max_occurred_alphabet(String sentence)
//     {
//         char[] alphabets = {'a','b','c','d','e','f','g'
//                            ,'h','i','j','k','l','m','n','o','p'
//                            ,'q','r','s','t','u','v'
//                            ,'w','x','y','z'}; //alphabetArray

//         int max_count_alphabet=0; //maxOccrrence // 가장 많이 나온 알파벳의 빈도수
//         char max_alphabet=alphabets[0]; // 가장 많이 나온 알파벳
 
//         for(char alphabet:alphabets)
//         {
//             int alphabet_count=0; //occrrence
            
//             for(char ch:sentence.toCharArray())
//             {
//                 if(alphabet==ch)
//                 {
//                     alphabet_count++;
//                 }
//             }
            
//             if(max_count_alphabet<alphabet_count)
//             {
//                  max_count_alphabet=alphabet_count;
//                  max_alphabet = alphabet;
//             }
//         }

//         return max_alphabet;
            
//     }
// }