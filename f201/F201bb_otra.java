package f201bb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class F201bb_otra {

    public static void main(String[] args) {
        
        String num = "";
        int cuadrado=0;

        try {
            
            System.out.print("Ingrese un valor formato entero:");        

            Scanner teclado = new Scanner(System.in);        
            num = teclado.nextLine();
                
            Integer intnum = Integer.parseInt(num);
                
            cuadrado = intnum * intnum;

            System.out.print("El cuadrado de " + num + " es " + cuadrado);

        }
        catch (NumberFormatException e ) {
            System.out.println("EL formato noes de un entero. Verifique!");
            e.printStackTrace();
        }
    }
}
