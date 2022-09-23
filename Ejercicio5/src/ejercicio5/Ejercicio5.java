/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero:");
        int numero = leer.nextInt();
        
        double raiz = Math.sqrt(numero);
        
        System.out.println("El doble de " + numero + " es: " + numero * 2);
        System.out.println("El triple de " + numero + " es: " + numero * 3);
        System.out.println("El raiz cuadrada de " + numero + " es: " + raiz);
        
    }
    
}
