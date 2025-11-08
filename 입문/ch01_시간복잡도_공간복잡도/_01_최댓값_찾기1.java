package 입문.ch01_시간복잡도_공간복잡도;

public class _01_최댓값_찾기1 {
    public static void main(String[] args) {
        int answer1 = find_max_num(new int[]{5,6,1,2,4});
        int answer2 = find_max_num(new int[]{530,55,5,55,5,5,4,353,43,234,234,234,23,42,6,1,2,4});
        int answer3 = find_max_num(new int[]{23,42,6,1,2,4});
        int answer4 = find_max_num(new int[]{23,3,6,1,2,4,42});
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
    }

    public static int find_max_num(int[] arr)
    {
        
        int current_max_value = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(current_max_value < arr[i])
            {
                current_max_value = arr[i];
            }
        }

        return current_max_value;
    }
}



// public class find_maximum_1{
//     public static void main(String[] args) {
//         int answer1 = find_max_num(new int[]{5,6,1,2,4});
//         int answer2 = find_max_num(new int[]{530,55,5,55,5,5,4,353,43,234,234,234,23,42,6,1,2,4});
//         int answer3 = find_max_num(new int[]{23,42,6,1,2,4});
//         int answer4 = find_max_num(new int[]{23,3,6,1,2,4,42});
//         System.out.println(answer1);
//         System.out.println(answer2);
//         System.out.println(answer3);
//         System.out.println(answer4);
//     }

//     public static int find_max_num(int[] arr)
//     {
        
//         int current_max_value = arr[0];
//         for(int num:arr)
//         {
//             if(current_max_value < arr)
//             {
//                 current_max_value = arr;
//             }
//         }

//         return current_max_value;
//     }
//}