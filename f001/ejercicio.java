package f001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// F001.- Realizar un programa que pida la entrada de un String que sea un color, 
// y repetir la entrada cuatro veces, guardando lo ingresado en un objeto ArrayList. 
// Luego mostrar en pantalla el contenido del ArrayList, iterando sobre el mismo
public class ejercicio {
    
    public void solucion() {
        int veces = 4;
        ArrayList<String> ar = new ArrayList<String>();
        
        // entrada
        System.out.println("Ingresar colores:");
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<veces; i++) {
            String color = sc.nextLine();
            ar.add(color);
        }
        
        // proceso
        
        // salida
        System.out.println("Contenido del ArrayList (for):");
        for (int i=0; i<veces; i++) {
            String valor = ar.get(i);
            System.out.println(valor);
        }
        
        System.out.println("Contenido del ArrayList (foreach):");
        for(String valor2 : ar ) {
            System.out.println(valor2);
        }


        System.out.println("Contenido del ArrayList (Iterator):");
        
        Iterator it = ar.iterator();
        while(it.hasNext()) {
            // String valor3 = it.next().toString();
            // String valor3 = (String)it.next();
            String valor3 = String.valueOf(it.next());
            System.out.println(valor3);
        }

    }
    
}
