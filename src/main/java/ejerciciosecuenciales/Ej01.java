/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosecuenciales;

import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Ej01 {

    public static void main(String[] args) {
        final double RUPIA = 86.55;
        Scanner teclado = new Scanner(System.in);
        
        //Algoritmo que lea una cantidad de euros y los pase a rupias indias.
        System.out.println("Introduzca una cantidad de euros(Valen decimales):");

        
        //Para pasar datos por teclado
        double euros = teclado.nextDouble();

        //Para pasar de euros a rupias
        double resultado = euros * RUPIA;

        //Resultado por consola
        System.out.println(euros + "€ son " + resultado + " rupias indias");
    }

}
