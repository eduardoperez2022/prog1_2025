package ejercicio_603;

import java.util.Scanner;

public class Ejercicio_603 {

    public static void main(String[] args) {
        
        int numero = (int)(Math.random() * 6) + 1;
        
        System.out.println("Elegir juego:");
        System.out.println("1 - Dados 2 jugadores");
        System.out.println("2 - Adivinar numero");
        System.out.println("3 - Adivinar numero b");
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = sc.nextInt();
        
        if (opcion == 1) {
            
            juegoDado jd = new juegoDado();
            jd.iniciar();
            jd.jugar();
            jd.finalizar();
            
        }
        else if (opcion == 2) {
            
            juegoA ja = new juegoA();
            ja.iniciar();
            ja.jugar();
            ja.finalizar();
            
        }
        else if (opcion == 3) {
            
            JuegoB jb = new JuegoB();
            jb.iniciar();
            jb.jugar();
            jb.finalizar();
            
            
            
        }
    }
    
}
