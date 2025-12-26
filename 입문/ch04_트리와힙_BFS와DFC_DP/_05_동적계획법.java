package 입문.ch04_트리와힙_BFS와DFC_DP;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class _05_동적계획법 {
    private static Map<Integer, BigInteger> memo = new HashMap<>();

    static {
        memo.put(1, BigInteger.ONE);
        memo.put(2, BigInteger.ONE);
    }
    
    private static BigInteger fiboDynamic(int n, Map<Integer, BigInteger> fiboMemo) {
        if (fiboMemo.containsKey(n)) {
            return fiboMemo.get(n);
        }

        BigInteger nthFibo = fiboDynamic(n - 1, fiboMemo).add(fiboDynamic(n - 2, fiboMemo)) ;
        fiboMemo.put(n, nthFibo);

        return nthFibo;
    }

    public static void main(String[] args) {
        System.out.println(fiboDynamic(100, memo));
    }
}




// package 입문.ch04_트리와힙_BFS와DFC_DP;

// public class _05_동적계획법 {
//     private static int input = 100;

//     public static long fiboRecursion(int n) {
//         if (n == 1 || n == 2) {
//             return 1;
//         }

//         return fiboRecursion(n - 1) + fiboRecursion(n - 2);
//     }

//     public static void main(String[] args) {
//         input = 20; // Using 20 instead of 100 for reasonable execution time
//         System.out.println("정답: 6765");
//         System.out.println(fiboRecursion(input)); 
//     }
// }
