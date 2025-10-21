package ejercicio_501;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class archivo {
    
    private ArrayList<String> lineas = new ArrayList();
    
    private String fileName = "d:/plantilla_examen1.csv";
    
    public void lectura() {
        
        FileReader origen = null;
        
        try {
            origen = new FileReader(fileName);
            BufferedReader br = new BufferedReader(origen);
            String line;
            while ((line = br.readLine()) != null) {
                // System.out.print(line.length() + " - ");
                // System.out.println(line);
                lineas.add(line);
            }            
        }
        catch (FileNotFoundException e) {
                e.printStackTrace();
         }
        
        catch (IOException e) {
                e.printStackTrace();
         }

    }

    public ArrayList<String> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<String> lineas) {
        this.lineas = lineas;
    }
    
    
    
}
