package f005;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// F005- Queremos guardar los nombres y la edades de los alumnos de un curso. 
// Realiza un programa que introduzca el nombre y la edad de cada alumno. El 
// proceso de lectura de datos terminará cuando se introduzca como nombre un 
// asterisco (*) Al finalizar se mostrará los siguientes datos:a) Todos lo alumnos, 
// agregando una marca a los mayores de edad.public 

class ejercicio {
    
    public void solucion() {
        
        ArrayList<alumno> alumnos = new ArrayList<alumno>();
        
        // entrada
        System.out.println("Ingresar alumnos (nombre y edad) termina con *:");
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        while(true) {
            
            String elnombre = sc.nextLine();
            
            if ("*".equals(elnombre)) {
                break;
            }

            Integer laedad = sc2.nextInt();
            alumno alx = new alumno(elnombre, laedad); 
            alumnos.add(alx);
            System.out.println("alumno ingresado ok");
            
        }
        
        // proceso
        
        
        // salida
        System.out.println("Los alumnos son:");
        for (int i=0; i<alumnos.size(); i++) {
            alumno al2 = alumnos.get(i);
            String mayorDeEdad = "";
            if (al2.getEdad() >= 18) {
                mayorDeEdad = "X";
            }
            
            System.out.println(al2.toString() + " " + mayorDeEdad);
        }
        
    }
    
}
