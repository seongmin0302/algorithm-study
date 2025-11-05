import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNotRepeatingFirstCharacter_20251103 {
    public static void main(String[] args) {
        System.out.println("정답 = d 현재 풀이 값 = " + findNotRepeatingFirstCharacter("abadabac"));
        System.out.println("정답 = c 현재 풀이 값 = " + findNotRepeatingFirstCharacter("aabbcddd"));
        System.out.println("정답 = _ 현재 풀이 값 = " + findNotRepeatingFirstCharacter("aaaaaaaa"));
        System.out.println("정답 = f 현재 풀이 값 = " + findNotRepeatingFirstCharacter("geeksforgeeks"));
        System.out.println("정답 = e 현재 풀이 값 = " + findNotRepeatingFirstCharacter("racecar"));
        System.out.println("정답 = _ 현재 풀이 값 = " + findNotRepeatingFirstCharacter("aabbccc"));
    }

    public static char findNotRepeatingFirstCharacter(String str)
    {
        int[] alphabetOccurenceArray = findAlphabetOccurenceArray(str);

        List<Character> notRepeatingCharacterArr=new ArrayList<Character>();
        for(int i=0;i<alphabetOccurenceArray.length;i++)
        {
            if(alphabetOccurenceArray[i]==1)
            {
                char notRepeatingCharacter = (char)(i+'a');
                notRepeatingCharacterArr.add(notRepeatingCharacter);
            }
        }

        for(char alphabet:str.toCharArray())
        {
            if(notRepeatingCharacterArr.contains(alphabet))
            {
                return alphabet;
            }
        }

        return '_';
    }

    
    public static int[] findAlphabetOccurenceArray(String str)
    {
        int[] alphabetOccurenceArray = new int[26];
        for(char alphabet:str.toCharArray())
        {
            if(!Character.isLetter(alphabet))
            {
                continue;
            }
            int index= alphabet-'a';
            alphabetOccurenceArray[index]++;
        }
        return alphabetOccurenceArray;

    }
}




// public class FindNotRepeatingFirstCharacter_20251103 {
//     public static void main(String[] args) {
//         System.out.println("정답 = d 현재 풀이 값 = " + findNotRepeatingFirstCharacter("abadabac"));
//         System.out.println("정답 = c 현재 풀이 값 = " + findNotRepeatingFirstCharacter("aabbcddd"));
//         System.out.println("정답 = _ 현재 풀이 값 = " + findNotRepeatingFirstCharacter("aaaaaaaa"));
//         System.out.println("정답 = f 현재 풀이 값 = " + findNotRepeatingFirstCharacter("geeksforgeeks"));
//         System.out.println("정답 = e 현재 풀이 값 = " + findNotRepeatingFirstCharacter("racecar"));
//         System.out.println("정답 = _ 현재 풀이 값 = " + findNotRepeatingFirstCharacter("aabbccc"));
//     }
    
//     public static char findNotRepeatingFirstCharacter(String str)
//     {
//         int[] alphabetArr = new int[26];
//         for(char alphabet:str.toCharArray())
//         {
//             alphabetArr[(int)alphabet-(int)'a']++;
//         }

//         for(char alphabet:str.toCharArray())
//         {
//             if(alphabetArr[(int)alphabet-(int)'a']==1)
//             {
//                 return alphabet;
//             }
//         }

//         return '_';
//     }
// }
