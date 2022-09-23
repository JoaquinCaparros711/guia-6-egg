/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero limite positivo");
        int numLimite = leer.nextInt();
        
        int suma, num;
        suma = 0;
        
        do {
            
            System.out.println("Ingrese un numero para ir sumando");
            num = leer.nextInt();
            
            suma = suma + num;
            
        } while (suma <= numLimite);
        
        
        
        
    }
    
}
