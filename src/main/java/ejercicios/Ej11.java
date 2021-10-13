/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author cristina
 */
public class Ej11 {

    public static void main(String[] args) {
        //Fallo en que n3 no está inicializado
        int n1 = 10, n2 = 30, suma = 0, n3 = 0;
        suma = n1 + n2;
        System.out.println("LA SUMA ES: " + suma);
        suma = suma + n3;
        System.out.println(suma);

    }

}
