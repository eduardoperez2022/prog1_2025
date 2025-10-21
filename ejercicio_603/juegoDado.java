package ejercicio_603;


import java.util.Scanner;
 
public class juegoDado implements juego{
    String jugador1;
    String jugador2;
    int dado1;
    int dado2;

    public void iniciar(){
        System.out.println("Ingrese el nombre de jugador 1");
        Scanner sc = new Scanner (System.in);
        jugador1 = sc.nextLine();
        System.out.println("Ingrese el nombre de jugador 1");
        Scanner scan = new Scanner (System.in);
        jugador2 = scan.nextLine();
    }
    public void jugar(){
        int dado1 =(int)(Math.random()* 6) +1;
        int dado2 =(int)(Math.random()* 6) +1;
        System.out.println("El jugado 1 "+ jugador1 + "saco " +dado1 );
        System.out.println("El jugado 2 "+ jugador2 + "saco " +dado2 );
        if (dado1 > dado2) {
            System.out.println("!El jugador 1 gana ");
            }else if(dado1 < dado2){
            System.out.println("El jugador 2 gana");
            }else {
            System.out.println("Empate");
            }
    }
    public void finalizar(){
        System.out.println("Gracias Por jugar");
    }
}