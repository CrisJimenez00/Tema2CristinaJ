/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Cris
 */
public class Ej15 {

    public static void main(String[] args) {
        //caso A
        //Lo que hace es que compara el valor de a en el codigo ascii con a, al ser true 
        //y ser true && true con resultado true por pantalla aparecerá true
        boolean adivina = ((97 == 'a') && true);
        System.out.println(adivina);

        //Caso B
        //Coge el valor de a en el código ascii, en este caso el 97 y lo mete dentro 
        //de la variable a de tipo int.
        int a = 'a';
        System.out.println(a);

        //Caso C
        //Lo reconocerá el programa como error debido a que en int solo recoge 
        //numeros enteros, no decimales como el valor 3.14
        //int pi = 3.14;
        //System.out.println(pi);

        //Caso D
        //No reconocerá 3,14 como número debido a que verá 14 como otra variable no como número.
        //double pi = 3,14;
        //System.out.println(pi);
        
        //Caso E
        //Rcogerá el resultado de si 1 es igual a 4(lo cual da false), lo guarda
        //en la variable y lo mostrará por pantalla
        boolean adivina2 = (1==4);
	System.out.println(adivina2);
        
    }

}
