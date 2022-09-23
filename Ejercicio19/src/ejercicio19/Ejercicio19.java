/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        int[][] matriz = new int [4][4];
        int[][] matriz2 = new int [4][4];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero de la fila "+ i + " y columna " + j );
                matriz[i][j] = leer.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[j][i] = matriz[i][j];
            }
        }
        
        //Calculos
        
        int suma = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (matriz[i][j] == matriz2[i][j]) {
                    suma = suma + 1;
                }     
                
            }
        }
        
        if (suma == 9) {
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz es anti simetrica");
        }  
 
        
        //Impresiones de las dos matrices
        
        imprimirMatriz(matriz);
        
        System.out.println(" ");

        imprimirMatriz(matriz2);
        
    }
    
    public static void imprimirMatriz(int[][] matriz) {
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
    
}
