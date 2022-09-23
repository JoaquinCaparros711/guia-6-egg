/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int suma = 0;
        
        System.out.println("=====DISPOSITIVO RS232=====");
        
        do {
            
            System.out.println("Ingrese una cadena al dispositivo");
            System.out.println("Para finalizar ingresar '&&&&&'");
            String cadena = leer.nextLine();
            cadena = cadena.toUpperCase();
            
            int largo = cadena.length();
            
            if ( cadena.substring(0,1).equals("X") && cadena.substring(largo-1,largo).equals("O") ) {
                if (largo <= 5) {
                    suma ++;
                } 
            } else if ( cadena.equals("&&&&&")) {
                    break;
            } else if ( largo > 5){
                    System.out.println("El maximo de la cadena es de 5 caracteres");
            }
            
            System.out.println("Cantidad de lecturas correctas: " + suma);

        } while (true);
        
        
    }
    
}
