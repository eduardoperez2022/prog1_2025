package Ejercicio_d12;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ejercicio {
    
    public void escribir()  {
        
        String nombre_archivo = "C:/temporal/salida.txt";
        try {
            PrintWriter writer = new PrintWriter(nombre_archivo);
            String salida = "";
            
            for (int n=0; n<10; n++) {
                salida = "Linea " + n;
                // writer.println(salida);
                writer.print(salida);
            }
            
            writer.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    
}
