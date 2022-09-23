/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

/**
 *
 * @author WIN11
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = new int [4][4];
        int[][] matriz2 = new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random()*9 + 1);
                matriz2[j][i] = matriz[i][j];
            }
        }
        
        imprimirMatriz( matriz );
        
        System.out.println(" ");

        imprimirMatriz( matriz2 );

        
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



    
