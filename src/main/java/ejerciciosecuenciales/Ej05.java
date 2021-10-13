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
public class Ej05 {

    public static void main(String[] args) {
        /*
        Una empresa de autocares cobra 150 euros fijos por servicio y además 
        15.3 céntimos por Km recorrido. Elabora un programa que lea el número 
        de km a recorrer y proporcione el presupuesto.
         */
        Scanner teclado = new Scanner(System.in);

        final int PRECIO_BASE = 150;
        final double EU_KM = 0.153;

        //Algoritmo que lea una cantidad de euros y los pase a rupias indias.
        System.out.println("Introduzca una cantidad de kms(Valen decimales):");

        //Meter por teclado
        double km = teclado.nextDouble();

        //Calculo
        double resul = PRECIO_BASE + (EU_KM * km);

        //mostrar por pantalla
        System.out.println("El cliente tiene que pagar: " + resul + "€");
    }
}
