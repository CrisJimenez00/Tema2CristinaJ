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
public class Ej02 {

    public static void main(String[] args) {
        //Algoritmo que lea el valor del radio y calcule el área del círculo.
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Introduzca el valor del radio(Valen decimales):");

        //Meter datos por consola
        double r = teclado.nextDouble();

        //Operación matemática
        double area = Math.PI * Math.pow(r,2);

        //Resultado
        System.out.println("El resultado es: " + area);

    }
}
