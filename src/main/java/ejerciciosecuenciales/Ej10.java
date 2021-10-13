/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosecuenciales;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author cristina
 */
public class Ej10 {

    public static void main(String[] args) {

        //Scanner teclado = new Scanner(System.in);
        final double VELOCIDAD = 200;
        final double TIEMPO = 20;

        double resultado = (VELOCIDAD * (TIEMPO / 60)) * 1000;
        final double KM_A_METROS1 = resultado;
        System.out.println("----------------------APARTADO A----------------"
                + "\nEl resultado del apartado A es: " + KM_A_METROS1 + " m");

//        System.out.println("\n\n-------------------APARTADO B-----------------");
//        System.out.println("Introduzca velocidad en km/h");
//        int velocidad = teclado.nextInt();
//
//        System.out.println("Introduzca tiempo de recorrido en mint");
//        int tiempo = teclado.nextInt();
//
//        int resultado2 = (velocidad * (tiempo / 60)) * 1000;
//        final double KM_A_METROS2 = resultado2;
//        System.out.println("El resulado del apartado B es: " + KM_A_METROS2 + " m");
        //Ejercicio anterior con JOption
        String texto = JOptionPane.showInputDialog(null, "Introduzca la velocidad en km/h");
        double kmHora = Double.parseDouble(texto);

        texto = JOptionPane.showInputDialog(null, "Introduzca el tiempo en minutos");
        double tiempoDouble = Double.parseDouble(texto);

        //para pasarlo a horas
        double tiempoEnHoras = (tiempoDouble / 60);

        //Se calcula
        double resultadoJOption = kmHora * tiempoEnHoras;

        //Lo pasamos a m
        double pasadoAMetros = resultadoJOption * 1000;

//        DecimalFormat df = new DecimalFormat("#.00");
//        String resultado = df.format(pasadoAMetros);
//        NumberFormat numeroResultado = NumberFormat.getInstance(pasadoAMetros);
        JOptionPane.showMessageDialog(null, "El resultado es: " + pasadoAMetros);
    }

}
