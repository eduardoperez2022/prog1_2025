package ejercicio_e001;

import java.util.Scanner;

public class ejercicio {
    
    public void solucion() {

        // entrada
        // pedir un numero
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero de mes:");
        int nmes = scan.nextInt();
        
        // proceso
        nmes = nmes-1;
        
        int[] mesdias = new int[12];
        mesdias[0]=31;
        mesdias[1]=28;
        mesdias[2]=31;
        mesdias[3]=30;
        mesdias[4]=31;
        mesdias[5]=30;
        mesdias[6]=31;
        mesdias[7]=31;
        mesdias[8]=30;
        mesdias[9]=31;
        mesdias[10]=30;
        mesdias[11]=31;

        String[] mesNombre = {"Enero","Febrero", "Marzo", "Abril",
                            "Mayo", "Junio", "Julio", "Agosto",
                            "Septiembre", "Octubre","Noviembre","Diciembre"};

        String mensaje = "El mes de " + mesNombre[nmes] + " tiene "  + mesdias[nmes] + " dias."; 
        
        //salida
        System.out.println(mensaje);
        
        
    }    
    
}
