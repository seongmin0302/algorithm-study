package 입문.ch01_시간복잡도_공간복잡도;

public class _01_최댓값_찾기2
{
    public static void main(String[] args)
    {
        int answer1 = find_max_num(new int[]{5,6,1,2,4});
        int answer2 = find_max_num(new int[]{530,55,5,55,5,5,4,353,43,234,234,234,23,42,6,1,2,4});
        int answer3 = find_max_num(new int[]{23,42,6,1,2,4});
        int answer4 = find_max_num(new int[]{23,3,6,1,2,4,42});
        int answer5 = find_max_num(new int[]{});
        
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
        System.out.println(answer5);
    }

    public static int find_max_num(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            boolean is_max_value = true;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    is_max_value = false;
                    break;
                }
            }

            if(is_max_value == true) // if(max_value)
            {
                return arr[i];
            }
        }

        return 0;
    }
}



// public class find_maximum_2
// {
//     public static void main(String[] args)
//     {
//         int answer1 = find_max_num(new int[]{5,6,1,2,4});
//         int answer2 = find_max_num(new int[]{530,55,5,55,5,5,4,353,43,234,234,234,23,42,6,1,2,4});
//         int answer3 = find_max_num(new int[]{23,42,6,1,2,4});
//         int answer4 = find_max_num(new int[]{23,3,6,1,2,4,42});
//         int answer5 = find_max_num(new int[]{});
        
//         System.out.println(answer1);
//         System.out.println(answer2);
//         System.out.println(answer3);
//         System.out.println(answer4);
//         System.out.println(answer5);
//     }

//     public static int find_max_num(int[] arr)
//     {
//         for(int num:arr)
//         {
//             boolean is_max_value = true;
//             for(int compareNumber:arr)
//             {
//                 if(num<compareNumber)
//                 {
//                     is_max_value = false;
//                     break;
//                 }
//             }

//             if(is_max_value == true) // if(max_value)
//             {
//                 return num;
//             }
//         }

//         return 0;
//     }
// }