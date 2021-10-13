/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author cristina
 */
public class Ej16 {

    public static void main(String[] args) {
        
        int a = 5, b = 3;
        
        //Lo pongo con espacios para que esté más limpio y visual 
        
        boolean resultado1 = 67 > 20 && 13 > 12,
                
                resultado2 = 10 <= 2 * 5 && 3 < 4 || !(8 > 7) && 3 * 2 <= 4 * 2 - 1,
                
                resultado3 = !(a > b && 2 * a <= b),
                
                resultado4 = a++ / 2 < b && (a++ / 2 > b || (a * 2 < b * 4)),
                
                resultado5 = b++ > 3 || a + b <= 8 && !(a > b);

        System.out.println("Los resultados son:"
                + "\n" + resultado1
                + "\n" + resultado2
                + "\n" + resultado3
                + "\n" + resultado4
                + "\n" + resultado5);

    }

}
