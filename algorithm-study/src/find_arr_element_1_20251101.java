public class find_arr_element_1_20251101 {
    public static void main(String[] args) {
        System.out.println("정답 = True 현재 풀이 값 ="+ find_arr_element(3,new int[]{3,5,6,1,2,4}));
        System.out.println("정답 = Flase 현재 풀이 값 ="+ find_arr_element(7,new int[]{6,6,6}));
        System.out.println("정답 = True 현재 풀이 값 ="+ find_arr_element(2,new int[] {6,9,2,7,1888}));
    }

    public static boolean find_arr_element(int find_num,int[] arr)
    {
        for(int num:arr)
        {
            if(num == find_num)
            {
                return true;
            }
        }

        return false;
    }
}
