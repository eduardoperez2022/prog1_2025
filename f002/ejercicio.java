package f002;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// F002- Realizar un programa que pida la entrada de un String que sea un color, 
// y repetir la entrada cuatro veces, guardando lo ingresado en un objeto ArrayList. 
// Luego pedir la entrada de dos colores más, los cuales deben insertarse como primero 
// y último elemento en el ArrayList anterior. Mostrar luego en pantalla el contenido 
// del ArrayList completo.

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
        
        System.out.println("Ingresar color inicio:");
        String color_inicio = sc.nextLine();
        
        System.out.println("Ingresar color final:");
        String color_final = sc.nextLine();
        
        // proceso
        ArrayList<String> sale = new ArrayList<String>();
        sale.add(color_inicio);
        sale.addAll(ar);
        sale.add(color_final);
        
        
        // salida
        System.out.println("Contenido del ArrayList (for):");
        for (int i=0; i<sale.size(); i++) {
            String valor = sale.get(i);
            System.out.println(valor);
        }
        
        System.out.println("Contenido del ArrayList (foreach):");
        for(String valor2 : sale ) {
            System.out.println(valor2);
        }


        System.out.println("Contenido del ArrayList (Iterator):");
        
        Iterator it = sale.iterator();
        while(it.hasNext()) {
            // String valor3 = it.next().toString();
            // String valor3 = (String)it.next();
            String valor3 = String.valueOf(it.next());
            System.out.println(valor3);
        }

    }
    
}
