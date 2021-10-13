/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author cristina
 */
public class Ej06 {

    public static void main(String[] args) {

        //Declaramos 3 variables de las cuales la C es la auxiliar(en mi ejemplo)
        int variableA, variableB, variableC;

        variableA = 45;
        variableB = 80;

        System.out.println("------------Antes del intercambio-----------------"
                + "\n variable A: " + variableA
                + "\n variable B: " + variableB);

        variableC = variableA; //Aquí decimos que 0(variable auxiliar) es igual a 45
        variableA = variableB; //Aquí decimos que variableA e igual a 80
        variableB = variableC; //Aquí decimos que variableB es igual a 45

        System.out.println("\n\n-------------------Después del cambio----------------"
                + "\n variable A: " + variableA
                + "\n variable B: " + variableB);

    }

}
