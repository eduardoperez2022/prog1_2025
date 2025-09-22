
package ejercicio_e401;

public class Ejercicio_E401 {

    public static void main(String[] args) {
        
        cuit c1 = new cuit();
        
        c1.setCuit("22334445556");
        System.out.println("Cuit ingresado:" + c1.getCuit());
        
        System.out.println("Cuit formateado:" + c1.getCuitFormato());
        
    }
    
}
