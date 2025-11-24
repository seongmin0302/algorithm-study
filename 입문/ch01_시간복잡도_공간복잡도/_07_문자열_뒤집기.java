package 입문.ch01_시간복잡도_공간복잡도;

public class _07_문자열_뒤집기 {
    public static void main(String[] args) 
    {
    int result1 = findCountToTurnOutToAllZeroOrAllOne("0001100");
    System.out.println("0001100="+result1);

    int result2 = findCountToTurnOutToAllZeroOrAllOne("11111");
    System.out.println("11111="+result2);

    int result3 = findCountToTurnOutToAllZeroOrAllOne("00000001");
    System.out.println("00000001="+result3);

    int result4 = findCountToTurnOutToAllZeroOrAllOne("11001100110011000001");
    System.out.println("11001100110011000001="+result4);

    int result5 = findCountToTurnOutToAllZeroOrAllOne("11101101");
    System.out.println("11101101="+result5);
    }

    public static int findCountToTurnOutToAllZeroOrAllOne(String input)
    {
        int countToAllZero=0;
        int countToAllOne=0;

        if(input.charAt(0)=='1')
        {
            countToAllZero++;
        }

        if(input.charAt(0)=='0')
        {
            countToAllOne++;
        }

        for(int i=0;i<input.length()-1;i++)
        {
            if(input.charAt(i)!=input.charAt(i+1))
            {
                if(input.charAt(i+1)=='1')
                {
                    countToAllZero++;
                }

                if(input.charAt(i+1)=='0')
                {
                    countToAllOne++;
                }
            }
        }

        return Math.min(countToAllZero, countToAllOne);
    }

 

    
}









// package 입문.ch01_시간복잡도_공간복잡도;

// public class _07_문자열_뒤집기 {
//     public static void main(String[] args) 
//     {
//     int result1 = findCountToTurnOutToAllZeroOrAllOne("0001100");
//     System.out.println("0001100="+result1);

//     int result2 = findCountToTurnOutToAllZeroOrAllOne("11111");
//     System.out.println("11111="+result2);

//     int result3 = findCountToTurnOutToAllZeroOrAllOne("00000001");
//     System.out.println("00000001="+result3);

//     int result4 = findCountToTurnOutToAllZeroOrAllOne("11001100110011000001");
//     System.out.println("11001100110011000001="+result4);

//     int result5 = findCountToTurnOutToAllZeroOrAllOne("11101101");
//     System.out.println("11101101="+result5);
//     }

//     public static int findCountToTurnOutToAllZeroOrAllOne(String input)
//     {
//         return Math.min(findCountToTurnOutToAllZero(input),findCountToTurnOutToAllOne(input));
//     }

//     public static int findCountToTurnOutToAllZero(String input)
//     {
//         int count=0;

//         if(input.charAt(0)=='1')
//         {
//             count++;
//         }

//         for(int i=0;i<input.length()-1;i++)
//         {
//             if(input.charAt(i)=='0' && input.charAt(i+1)=='1')
//             {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static int findCountToTurnOutToAllOne(String input)
//     {
//         int count=0;

//         if(input.charAt(0)=='0')
//         {
//             count++;
//         }

//         for(int i=0;i<input.length()-1;i++)
//         {
//             if(input.charAt(i)=='1' && input.charAt(i+1)=='0')
//             {
//                 count++;
//             }
//         }
//         return count;
//     }



    
// }
