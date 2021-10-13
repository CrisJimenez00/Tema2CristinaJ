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
public class Ej03 {

    public static void main(String[] args) {
        final int EXAMENES = 3;
        Scanner teclado = new Scanner(System.in);


        //Algoritmo que lea tres notas numéricas de tipo double y calcule la nota media.
        System.out.println("Introduzca una nota(Valen decimales):");

        //Meter por teclado los datos
        double nota1 = teclado.nextDouble();
        
        System.out.println("Introduzca la segunda nota(Valen decimales):");
        double nota2 = teclado.nextDouble();
        
        System.out.println("Introduzca la tercera nota(Valen decimales):");
        double nota3 = teclado.nextDouble();

        //Calcular la media
        double resultado = (nota1 + nota2 + nota3) / EXAMENES;

        //Mostrar por teclado
        System.out.println("La media es de: " + resultado);
    }

}
