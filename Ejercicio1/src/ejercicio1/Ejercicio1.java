/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("La suma de los dos numeros es: " + suma );
        
    }

}
