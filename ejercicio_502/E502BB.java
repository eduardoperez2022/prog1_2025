package e501b;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class E502BB {
    
    public void solucion(){
        LocalDate fechaNacimiento = LocalDate.of(1988, 9, 29); // yyyy, mm, dd
//        LocalDate fechaNacimiento2 = LocalDate.parse("1988-29-09");
//        LocalDate fechaNacimiento3 = LocalDate.parse("09-29-1988");
//        LocalDate fechaNacimiento4 = LocalDate.parse("09/29/1988");
//        LocalDate fechaNacimiento5 = LocalDate.parse("29/09/1988", DateTimeFormatter.ofPattern("E, MMM dd yyyy"));

        // 2. Crear los distintos formatos
        DateTimeFormatter formatoA = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatoB = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoC = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH); // Usa abreviaciones en inglés
        DateTimeFormatter formatoD = DateTimeFormatter.ofPattern("E, MMM dd yyyy", Locale.ENGLISH);

        // 3. Mostrar los resultados
        System.out.println("a) " + fechaNacimiento.format(formatoA)); // 1988-09-29
        System.out.println("b) " + fechaNacimiento.format(formatoB)); // 29/09/1988
        System.out.println("c) " + fechaNacimiento.format(formatoC)); // 29-Sep-1988
        System.out.println("d) " + fechaNacimiento.format(formatoD)); // Thu, Sep 29 1988
        
                
        
    }
}
