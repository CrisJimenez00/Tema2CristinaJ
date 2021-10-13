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
public class Ej05 {

    public static void main(String[] args) {
        
        //Declara una variable primitiva de cada uno de los tipos estudiados.
        //Variables número entero
        byte entero1;
        int entero2;
        short entero3;
        long entero4;

        //Variables número decimal
        float decimal1;
        double decimal2;

        //Variable logica
        boolean logico;

        //Variable caracter
        char caracter;

        //Declara una constante numérica de tipo double y otra de tipo int.
        //Declaracion de constantes con el prefijo final
        final double CONSTANTE1 = 7.45;
        final int CONSTANTE2 = 5;

        //Declara un objeto String.
        String texto1;

        //Inicializa las variables, la constante y el objeto con literales de tu elección.
        //Enteros
        entero1 = 30;
        entero2 = -5;
        entero3 = 4;
        entero4 = -70;

        //Decimales
        decimal1 = 3.14f;
        decimal2 = 0.854;

        //Logicos
        logico = true;

        //Caracter
        caracter = 'Z';

        //String
        texto1 = "Hola";

        //Imprimimos por pantalla todas las variables y constantes y la memoria que usan
        //El \n es como darle a enter
        System.out.println("\n------------ENTEROS-----------\n\n"
                + entero1 + " es byte y ocupa 8 bits\n"
                + entero2 + " es int y ocupa 32 bits\n"
                + entero3 + " es short y ocupa 16 bits\n"
                + entero4 + " es long y ocupa 64 bits\n"
                + "\n----------------DECIMALES-----------\n\n"
                + decimal1 + " es float y ocupa 32 bits\n"
                + decimal2 + " es double y ocupa 64 bits\n"
                + "\n-----------LÓGICO-----------\n\n"
                + logico + " es boolean y ocupa 1 bit\n"
                + "\n----------CARACTER----------\n\n"
                + caracter + " es char y ocupa 16 bits\n"
                + "\n--------CONSTANTES-----------\n\n"
                + CONSTANTE1 + " es constante int\n"
                + CONSTANTE2 + " es constante double\n"
                + "\n---------TEXTO------------\n\n"
                + "'" + texto1 + "'" + " es un texto");

    }

}
