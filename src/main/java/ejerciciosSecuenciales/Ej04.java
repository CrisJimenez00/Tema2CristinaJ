/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosSecuenciales;

import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Ej04 {

    public static void main(String[] args) {
        
        final double LIBRAS = 0.0022;
        
        //Realiza un programa que lea una cantidad de gramos y obtenga su equivalencia en libras.
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca una cantidad de gramos(Valen decimales): ");

        //Meter por teclado
        double gramos = teclado.nextDouble();

        //Calculo
        double resul = gramos * LIBRAS;

        //Sacar por pantalla
        System.out.println("El resultado es: " + resul + " libras");

    }

}
