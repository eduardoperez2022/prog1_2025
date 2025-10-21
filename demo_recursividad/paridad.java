
package demo_factorial1;

import static demo_factorial1.ejemplo_factorial.factorial_iter;
import java.math.BigDecimal;
import java.util.Scanner;


public class paridad {

    public void menu() {

        int nNum;

        System.out.println("Calculo de paridad");
        System.out.println("Ingrese un entero:");
        
        Scanner sc = new Scanner(System.in);
        
        nNum = sc.nextInt();

        System.out.println("\n \t" + nNum + "es impar: " + esimpar(nNum));

        System.out.println("\n \t" + nNum + "es par: " + espar(nNum));

    }
    
    
    public boolean esimpar(int numero) {
        if (numero == 0) {
            return false;
        } else {
            boolean ret = espar(numero - 1);
            return ret;
        }
    }

    public boolean espar(int numero) {
        if (numero == 0) {
            return true;
        } else {
            boolean ret2 = esimpar(numero - 1);
            return ret2;
        }
    }

}
