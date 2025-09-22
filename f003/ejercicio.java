package f003;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// F003- Realizar un programa que pida la entrada de un numero entero, y repetir 
// la entrada ocho veces, guardando lo ingresado en un objeto ArrayList. Luego 
// recorrer este ArrayList, y generar dos nuevos ArrayList, uno con los elementos 
// pares ingresados, y otro con los elementos impares. Mostrar luego enpantalla el 
// contenido de los tres ArrayList.
public class ejercicio {
    
    public void solucion() {
        
        int veces = 8;
        ArrayList<Integer> entrada = new ArrayList<Integer>();
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();
        
        // entrada
        System.out.println("Ingresar numeros:");
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<veces; i++) {
            Integer numx = sc.nextInt();
            entrada.add(numx);
        }
        
        // proceso
        for (int i=0; i<veces; i++) {
            Integer valor = entrada.get(i);
            if (valor%2 == 0) {
                // es par
                pares.add(valor);
            }
            else {
                impares.add(valor);
            }
        }
        
        // salida
        System.out.println("Contenido de la entrada:");
        for(Integer valor2 : entrada ) {
            System.out.println(valor2);
        }

        System.out.println("Contenido de pares:");
        for(Integer valor2 : pares ) {
            System.out.println(valor2);
        }

        System.out.println("Contenido de impares:");
        for(Integer valor2 : impares ) {
            System.out.println(valor2);
        }
        
    }
    
}
