package ejercicio_e401;

public class cuit {
    
    private String elcuit="";
    // setCuit, getCuit, getCuitFormato

    public cuit() {
    }
    
    public cuit(String pcuit) {
        this.elcuit = pcuit;
    }
    
    public void setCuit(String cuitx) {
        this.elcuit = cuitx;
    }
    
    public String getCuit() {
        return this.elcuit;
    }
    
    public String getCuitFormato() {
        String cuitFormateado="";
        
        // salida en formato AA-BBCCCDDD-E
        String parte1 = this.elcuit.substring(0,2);
        String parte2 = this.elcuit.substring(2,10);
        String parte3 = this.elcuit.substring(10,11);
        
        cuitFormateado = parte1.concat("-").concat(parte2).concat("-").concat(parte3);
        
        return cuitFormateado;
    }
    
    
    
    
}
