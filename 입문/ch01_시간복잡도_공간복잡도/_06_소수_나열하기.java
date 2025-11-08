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
        if(number==1)
        {
            primeListUnderNumber.add(1);
            return primeListUnderNumber;
        }
        if(number==2)
        {
            primeListUnderNumber.add(1);
            primeListUnderNumber.add(2);
            return primeListUnderNumber;
        }
        for(int i=1;i<=number;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    primeListUnderNumber.add(i);
                    continue;
                }
            }
        }

        return primeListUnderNumber;
    }
}
