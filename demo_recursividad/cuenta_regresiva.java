package demo_factorial1;

public class cuenta_regresiva {

    public void cuentaRegresiva(int numero) {
        numero--;
        if (numero > 0) {
            System.out.println(numero);
            //Llamar la misma función
            cuentaRegresiva(numero);
        } else {
            System.out.println("LLego hasta 0");
        }
    }

}
