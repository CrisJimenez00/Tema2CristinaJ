/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author cristina
 */
public class Ej07 {

    public static void main(String[] args) {

        //a.- Declaramos e inicializamos tres variables int 
        int a = 1, b = 2, c = 3, aux1;

        //b.- Declaramos e inicializamos tres variables double 
        double d = 4.5, e = 5.7, f = 6.9, aux2;

        //c .- Mostramos las variables por consola
        System.out.println("Variables enteros: " + a + " , " + b + " , " + c);
        System.out.println("Variables double: " + d + " , " + e + " , " + f);

        //d.- Realiza los siguiente intercambios de valores: en b guarda c, 
        //en c guarda a, en a guarda b.
        
        aux1 = a; //Aquí guardamos en aux el valor 1
        a = b;  //Hacemos que a valga 2
        b = c;  //Hacemos que b valga 3
        c = aux1; //hacemos que c valga 1

        System.out.println("Variables enteros: " + a + " , " + b + " , " + c);

        //e.- Realiza los siguiente intercambios de valores: en e guarda f, 
        //en f guarda d, en d guarda e. 
        
        aux2 = d;//Aquí guardamos en aux el valor 4.5
        d = e;//Hacemos que d valga 5.7
        e = f; //Hacemos que e valga 6.9
        f = aux2; //Hacemos que f valga 4.5

        System.out.println("Variables double: " + d + " , " + e + " , " + f);
    }

}
