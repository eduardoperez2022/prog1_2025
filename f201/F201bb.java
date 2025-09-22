package f201bb;

import java.util.InputMismatchException;
import java.util.Scanner;

public class F201bb {

    public static void main(String[] args) {
        
        int num =0;
        int cuadrado=0;
        
        while(true) {
            
            System.out.print("Ingrese un valor entero:");        

            try {
                Scanner teclado = new Scanner(System.in);        
                num = teclado.nextInt();        
                cuadrado = num * num;
                break;
            }
            catch(InputMismatchException e) {
                System.out.println("El ingreso no corresponde a un valor entero. Verifique!");
            }
        }
        
        System.out.print("El cuadrado de " + num + " es " + cuadrado);
    }
}
