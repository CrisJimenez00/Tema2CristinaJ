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
public class Ej09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Pedimos datos por pantalla
        System.out.println("Indique la medida de la diagonal Mayor");
        double diagonalMayor = teclado.nextDouble();

        System.out.println("Indique la medida de la diagonal Menor");
        double diagonalMenor = teclado.nextDouble();

        //Calculamos
        double resultado = (diagonalMayor * diagonalMenor) / 2;

        //Mostramos
        System.out.printf("El area es de: %.2f", resultado);
        /*
        Como funciona el printf(QUE NO SE ME OLVIDE QUE SE USA)
        
        printf("%._f", a);
        
        El _ es el número de decimales que queremos que salga
        a es la variable que queremos mostrar con el número de decimales que hayamos puesto ne lugar de _

        
        printf("%.2f %.3f",a,b);
        En este caso el 2f afecta al valor a y 3f a b
        Entre %.2f %.3f hay un espacio
        
         */
    }
}
