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
public class Ej07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final double GALON = 3.78;
        final double PRECIO = 1.20;

        //Pedimos datos por pantalla
        System.out.println("Introduzca los litros que desea valorar");
        double litro = teclado.nextDouble();

        //Calculamos
        double resultado = (litro / GALON) * PRECIO;

        //Mostramos resultado por pantalla
        System.out.println("El precio es de : " + resultado);
    }

}
