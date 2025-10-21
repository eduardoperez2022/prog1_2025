package ejercicio_603;

import java.util.Random;
import java.util.Scanner;

public class JuegoB implements juego {
    
    int numeroSecreto;
    int intentos;
    final int MAX_INTENTOS = 5;
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    @Override
    public void iniciar() {
        System.out.println("¡¡¡¡¡Bienvenidooo al juego de ADIVINAR EL NUMEEROOOOO!!!!!!");
        numeroSecreto = rd.nextInt(100) + 1;
        System.out.println("Bien solo tenes " + MAX_INTENTOS + " para hacer este juego y tenes que pegarle entre el 1 al 100");
    }

    @Override
    public void jugar() {
        
        boolean acierto = false;

        while (intentos < MAX_INTENTOS && !acierto) {
            System.out.print("Intento " + (intentos + 1) + ": Ingrese un numero: ");
            int numero = sc.nextInt();
            intentos++;

            if (numero == numeroSecreto) {
                System.out.println("Adivinaste el numero!");
                acierto = true;
            } else if (numero < numeroSecreto) {
                System.out.println("El numero es mas grande!!!");
            } else {
                System.out.println("El numero es mas chico!!!");
            }
        }

        if (!acierto) {
            System.out.println("Se acabaron los intentos. El número era: " + numeroSecreto);
        }
    }

    @Override
    public void finalizar() {
        System.out.println("Fin del juego ");
        System.out.println("Hasta la proximaa!!!!");
    }
    
}
