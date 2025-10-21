package ejercicio_603;

    
import java.util.Scanner;
 
public class juegoA implements juego {
 
    int numeroIngresado;
    int numeroIncognito;
    int cantidadIntentos;
 
    static Scanner scanner = new Scanner(System.in);
 
    public void iniciar() {
        System.out.println("Bienvenido al juego de adivinar el numero");
        numeroIncognito = (int) (Math.random() * 100) + 1;
    }
 
    public void jugar() {
        cantidadIntentos = 0;
        int intentosUtilizados = 5;
        do {
            System.out.println("Ingrese un numero del 1 al 100. Tiene " + intentosUtilizados + " intentos");
            numeroIngresado = scanner.nextInt();
 
//            if(numeroIncognito != numeroIngresado){
//                System.out.println("Incorrecto. Ingrese otro numero");
//            } else 
            if (numeroIngresado < numeroIncognito) {
                System.out.println("El numero es mayor");
            } else if (numeroIngresado > numeroIncognito) {
                System.out.println("El numero es menor");
            }
            cantidadIntentos++;
            intentosUtilizados--;
        } while (numeroIngresado != numeroIncognito & cantidadIntentos < 5);
    }
 
    public void finalizar() {
        if (numeroIncognito == numeroIngresado) {
            System.out.println("Felicidades. Has acertado el numero en " + cantidadIntentos + " intentos");
        } else {
            System.out.println("Lo siento. La proxima sera. El numero secreto era " + numeroIncognito);
        }
    }
}    
    
    
