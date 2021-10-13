/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author cristina
 */
public class Ej09 {

    public static void main(String[] args) {
        //Declaramos variables
        int a = 10, b = 20;
        boolean aMenorB, aMayorB, aIgualB, aDistintoB;
        
        //Comprobamos resultados y guardamos en variable
        aMenorB = a < b;
        aMayorB = a > b;
        aIgualB = a == b;
        aDistintoB = a != b;
        
        //Mostramos por pantalla
        System.out.println("------------RESULTADOS---------------"
                + "\nValor de a : " + a
                + "\nValor de b : " + b
                + "\n---------------------------------"
                + "\nResultado de a < b : " + aMenorB
                + "\nResultado de a > b : " + aMayorB
                + "\nResultado de a == b : " + aIgualB
                + "\nResultado de a != b : " + aDistintoB
        );
    }

}
