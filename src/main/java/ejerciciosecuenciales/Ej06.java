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
public class Ej06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Pedimos datos por pantalla
        System.out.println("Inserte el valor de número A(Valen decimales)");
        int numA = teclado.nextInt();

        System.out.println("Inserte el valor del número B(Valen decimales)");
        int numB = teclado.nextInt();

        //Calculamos
        int div = numA / numB;
        int mod = numA % numB;

        //Mostramos resultados por pantalla
        System.out.println("El resultado de la división a / b es : " + div
                + "\n\nEl resto de la división entre a y b es : " + mod);
    }

}
