/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Ejercicio11 {

    private static Object resp;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);        
        
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        
        String resp;
        int opcion;
        
        //Menu
        do {
            
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija una opcion:");
            opcion = leer.nextInt();
            
            resp = leer.nextLine();
            if (resp.equals("s")) {
                break;
            }

            
            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    continue;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    continue;
                case 3:
                    int multi = num1 * num2;
                    System.out.println("La multiplicacion es: " + multi);
                    continue;
                case 4:
                    int division = num1 / num2;
                    System.out.println("La division es: " + division);
                    continue;
                case 5:
                    System.out.println("Esta seguro que desea salir s/n?");
                    resp = leer.nextLine();
            }
            
            
                
        } while ( !resp.equals("s") );
        
        
    }
    
}
