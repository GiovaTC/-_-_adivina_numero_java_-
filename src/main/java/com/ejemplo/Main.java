package main.java.com.ejemplo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int numeroUsuario = 0;
        int intentos = 0;

        System.out.println("==============================");
        System.out.println("     ADIVINA EL NUMERO");
        System.out.println("==============================");
        System.out.println("Debes adivinar un numero entre 1 y 100.");

        while (numeroUsuario != numeroSecreto) {

            System.out.print("\ningrese un numero: ");
            numeroUsuario = teclado.nextInt();

            intentos++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println("el numero secreto es Mayor!");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El numero secreto es Menor!");
            } else {
                System.out.println();
                System.out.println("****************************");
                System.out.println("¡FELICIDADES!");
                System.out.println("Adivinaste el numero.");
                System.out.println("Numero: " + numeroSecreto);
                System.out.println("Intentos: " + intentos);
                System.out.println("****************************");
            }
        }

        teclado.close();
    }
}