/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int[] vector = new int[10];
        
        int suma = 0;
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
        }
        
        System.out.println("Ingrese un numero que desea buscar en el vector");
        int num = leer.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            if ( num == vector[i] ) {
                System.out.println("El numero se encuentra en la posicion " + i );
                suma = suma + 1;
            }
            
        }
        
        if (suma > 1) {
            System.out.println("El numero se encuentra repetido mas de una vez");
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(vector[i]);
        }
        
    }
    
}
