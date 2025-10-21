package ejercicio_501;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {

    public void menu1() {
        
        System.out.println("Lectura de datos de un archivo");
        
        System.out.println("Presione Enter para proceder");
        
        Scanner sc = new Scanner(System.in);
        
        String tecla = sc.nextLine();
        
        proceso proc = new proceso();
        
        // realizar proceso que se pide
        proc.trabajo();
        
        ArrayList<alumno> salida = proc.getOrdenados();
        
        System.out.println("Lista ordenada:");
        
        for(alumno aly : salida) {
            
            System.out.print(aly.getApellido() + " ");
            System.out.print(aly.getNombre() + " ");
            System.out.println(aly.getDni());
            
        }
        
        System.out.println("Muchas gracias.");
        
    }
    
}
