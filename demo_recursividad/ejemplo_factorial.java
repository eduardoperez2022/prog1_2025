package demo_factorial1;

import java.math.BigDecimal;
import java.util.Scanner;

public class ejemplo_factorial {

    public void menu() {

        long nNum;

        System.out.println("Calculo de factorial");
        System.out.println("Ingrese un entero:");
        
        Scanner sc = new Scanner(System.in);
        
        nNum = sc.nextLong();

        System.out.println("\n \t" + nNum + "!= " + factorial_iter(nNum));

        System.out.println("\n \t" + nNum + "!= " + factorial_recur(nNum));

        System.out.println("\n \t" + nNum + "!= " + factorial_recur(new BigDecimal(nNum)));
    }


    static long factorial_iter(long n) {

        long fact = 1;
        for (long i = 1; i <= n; i++) {
            fact = i * fact;
        }
        return fact;

    }

    public long factorial_recur(Long n) {
        if (n <= 1) {
            return 1;
        } else {
            long resultado = n * factorial_recur(n - 1);
            return resultado;
        }
    }


    public BigDecimal factorial_recur(BigDecimal n) {
        if (n.compareTo(BigDecimal.ONE) <= 0) {
            return BigDecimal.ONE;
        } else {
            BigDecimal resultado = n.multiply(factorial_recur(n.subtract(BigDecimal.ONE)));
            return resultado;
        }
    }    
    

}
