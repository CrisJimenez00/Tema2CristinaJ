/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Ej14 {

    public static void main(String[] args) {
        System.out.println("Introduce cantidad de segundos:");

        //lectura de datos por teclado mediante Scanner
        Scanner teclado = new Scanner(System.in);
        int tiempo = teclado.nextInt();

        //Declaramos e inicializamos constantes
        final int HORAS = 3600;
        final int MINUTOS = 60;

        //Para saber las horas
        int horas = tiempo / HORAS;

        //Con lo que sobra para saber los minutos
        int minutos = (tiempo % HORAS) / MINUTOS;

        //Lo que sobra del anterior para saber los segundos
        int segundos = (tiempo % HORAS) % MINUTOS;

        System.out.printf("El tiempo introducido son: "
                + horas + " horas, "
                + minutos + " minutos y "
                + segundos + " segundos.");
    }

}
