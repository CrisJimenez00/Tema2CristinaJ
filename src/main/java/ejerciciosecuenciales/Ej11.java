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
public class Ej11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el valor x1");
        int valorX1 = teclado.nextInt();

        System.out.println("Introduzca el valor y1");
        int valorY1 = teclado.nextInt();

        System.out.println("Introduzca el valor x2");
        int valorX2 = teclado.nextInt();

        System.out.println("Introduzca el valor y2");
        int valorY2 = teclado.nextInt();

        double solucion = Math.sqrt(Math.pow((valorX2 - valorX1), 2) + Math.pow((valorY2 - valorY1), 2));
        //Con Math.abs (sale un número con valor absoluto, es decir, siempre positvio)

        System.out.println("La solución es: " + solucion);
    }

}
