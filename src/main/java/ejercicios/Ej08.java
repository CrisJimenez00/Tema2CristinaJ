/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author cristina
 */
public class Ej08 {

    public static void main(String[] args) {
        int a = 10, b = 5, i = 0;
        double c = 71.3, d = 4.8;

        //c. - Realiza las siguiente operaciones aritméticas.
        // a + b, a - b, a * b, a / b, c + d, c - d, c * d, c / d.
        //Enteros
        int resul1 = a + b;
        int resul2 = a - b;
        int resul3 = a * b;
        int resul4 = a / b;

        //Decimales
        double resul5 = c + d;
        double resul6 = c - d;
        double resul7 = c * d;
        double resul8 = c / d;

        System.out.println("Valores originales:"
                + "\n a = " + a
                + "\n b = " + b
                + "\n c = " + c
                + "\n d = " + d
        );
        
        //d.- Muestra el resultado de cada operación, usando las variables creadas en el paso c).
        
        System.out.println("\n\nResultado de las operaciones de números enteros:"
                + "\n a + b = " + resul1
                + "\n a - b = " + resul2
                + "\n a * b = " + resul3
                + "\n a / b = " + resul4
                + "\n\nResultado de las operaciones de números decimales:"
                + "\n c + d = " + resul5
                + "\n c - d = " + resul6
                + "\n c * d = " + resul7
                + "\n c / d = " + resul8);
        
        //e.- También muestra en pantalla los resultados de las siguientes operaciones: a*=3, b-=1, a/=b, c+=d.
        
        System.out.println("\n\nResultados de: "
                + "\n a*=3 :" + (a *= 3)
                + "\n b-=1 :" + (b -= 1)
                + "\n a/=b :" + (a /= b)
                + "\n c+=d :" + (c += d));
        
        //f.- Finalmente, el programa muestra en consola la siguiente información, 
        //en distintas instrucciones: valor de i, valor de i++, valor de i y valor de ++i.
        
        System.out.println("\n\nValores de i:"
                + "\nvalor de i: " + i
                + "\nvalor de i++: " + i++
                + "\nvalor de i: " + i
                + "\nvalor de ++i: " + ++i);
    }

}
