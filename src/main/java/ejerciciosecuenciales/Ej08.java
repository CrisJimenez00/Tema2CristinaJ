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
public class Ej08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double IVA = 0.16;

        //Pedimos datos por pantalla
        System.out.println("Introduzca el precio del artículo");
        double precio = teclado.nextDouble();

        //Calculamos
        double resultado = (precio * IVA) + precio;

        //Mostramos resultado por pantalla
        System.out.println("El precio con IVA es de: " + resultado);

    }

}
