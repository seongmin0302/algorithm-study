package 입문.ch01_시간복잡도_공간복잡도;
import java.util.ArrayList;

public class _06_소수_나열하기 {
    public static void main(String[] args) {
        ArrayList<Integer> primeListUnderNumber=findPrimeListUnderNumber(20);
        for(int prime:primeListUnderNumber)
        {
            System.out.print(prime+" ");
        }
    }

    public static ArrayList<Integer> findPrimeListUnderNumber(int number)
    {
        ArrayList<Integer> primeListUnderNumber=new ArrayList<Integer>();

        for(int n=2;n<=number;n++)
        {
            boolean isPrime=true;
            for(int primeNumber:primeListUnderNumber)
            {
                if(primeNumber*primeNumber<=n && n%primeNumber==0)
                // primeNumber * primeNumber <= n
                // primeNumber <= √n
                // 소수인지 판별하기 위해서 √N 이하의 자연수들로만 나눠보면 된다.
                {
                    isPrime=false;
                    break;
                }
            }
            
            if(isPrime==true)
            {
                primeListUnderNumber.add(n);
            }
        }

        return primeListUnderNumber;
    }
}





// package 입문.ch01_시간복잡도_공간복잡도;
// import java.util.ArrayList;

// public class _06_소수_나열하기 {
//     public static void main(String[] args) {
//         ArrayList<Integer> primeListUnderNumber=findPrimeListUnderNumber(20);
//         for(int prime:primeListUnderNumber)
//         {
//             System.out.print(prime+" ");
//         }
//     }

//     public static ArrayList<Integer> findPrimeListUnderNumber(int number)
//     {
//         ArrayList<Integer> primeListUnderNumber=new ArrayList<Integer>();

//         Loop1:for(int i=2;i<=number;i++)
//         {
//             for(int j=2;j<=i-1;j++)
//             {
//                 if(i%j==0)
//                 {
//                     continue Loop1;
//                 }
//             }
//             primeListUnderNumber.add(i);
//         }

//         return primeListUnderNumber;
//     }
// }







// package 입문.ch01_시간복잡도_공간복잡도;
// import java.util.ArrayList;

// public class _06_소수_나열하기 {
//     public static void main(String[] args) {
//         ArrayList<Integer> primeListUnderNumber=findPrimeListUnderNumber(20);
//         for(int prime:primeListUnderNumber)
//         {
//             System.out.print(prime+" ");
//         }
//     }

//     public static ArrayList<Integer> findPrimeListUnderNumber(int number)
//     {
//         ArrayList<Integer> primeListUnderNumber=new ArrayList<Integer>();

//         for(int i=2;i<=number;i++)
//         {
//             boolean isPrime=true;
//             for(int j=2;j<=i-1;j++)
//             {
//                 if(i%j==0)
//                 {
//                     isPrime=false;
//                     break;
//                 }
//             }
            
//             if(isPrime==true)
//             {
//                 primeListUnderNumber.add(i);
//             }
//         }

//         return primeListUnderNumber;
//     }
// }
