/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("A que moneda desea convertir los euros?");
        System.out.println("Opciones: Dolares, Libras, Yenes ");
        String resp = leer.nextLine();
        resp = resp.toUpperCase();
        
        System.out.println("Ingrese cantidad de euros para convertir a dolares");
        int cantidad = leer.nextInt();
        
        nombre( cantidad, resp );
        
        
    }
    
    public static void nombre( int cantidadEuros, String resp ) {
        
        if (resp.equals("DOLARES")) {
            double dolares = cantidadEuros * 1.28611;
            System.out.println( dolares + " $ son " + cantidadEuros + " €");
        } else if (resp.equals("LIBRAS")) {
            double libras = cantidadEuros / 0.86;
            System.out.println( libras + " libras son " + cantidadEuros + " €");
        }else if (resp.equals("YENES")) {
            double yenes = cantidadEuros * 129.852;
            System.out.println( yenes + " yenes son " + cantidadEuros + " €");
        } else {
            System.out.println("Moneda incorrecta");
        }
    }
    
}
