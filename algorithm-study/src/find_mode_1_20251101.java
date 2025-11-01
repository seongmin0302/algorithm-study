import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class find_mode_1_20251101 {
    public static void main(String[] args) {
        System.out.println("정답 = i, 현재 풀이 값 =" + find_max_occurred_alphabet("hello my name is dingcodingco"));
        System.out.println("정답 = e, 현재 풀이 값 =" + find_max_occurred_alphabet("we love algorithm"));
        System.out.println("정답 = b, 현재 풀이 값 =" + find_max_occurred_alphabet("best of best youtube"));
    }

    public static char find_max_occurred_alphabet(String sentence)
    {
        int[] alphbet_count = new int[26]; //alphabetOccurrenceArray
        for(int i=0;i<sentence.length();i++)
        {
            char alphbet = sentence.charAt(i);
            if('a'<=alphbet && alphbet <= 'z')
            {
                int index = (int)alphbet-(int)'a';
                alphbet_count[index]++;   
            }
        }

        int max_value_index = 0;

        for(int i=0;i<alphbet_count.length;i++)
        {
            if(alphbet_count[max_value_index]<alphbet_count[i])
            {
                max_value_index = i;
            }
        }

        return (char)(max_value_index+(int)'a');
            
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
//         int[] alphbet_count = new int[26]; //alphabetOccurrenceArray
//         for(char ch:sentence.toCharArray())
//         {
//             if('a'<=ch && ch<= 'z')
//             {
//                 int index = (int)ch-(int)'a';
//                 alphbet_count[index]++;   
//             }
//         }

//         int max_value_index = 0;

//         for(int i=0;i<alphbet_count.length;i++)
//         {
//             if(alphbet_count[max_value_index]<alphbet_count[i])
//             {
//                 max_value_index = i;
//             }
//         }

//         return (char)(max_value_index+(int)'a');
            
//     }
// }