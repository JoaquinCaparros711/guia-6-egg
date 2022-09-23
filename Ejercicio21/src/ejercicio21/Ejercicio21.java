/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

/**
 *
 * @author WIN11
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Inicializacion de matrices
        int [][] matriz1 = new int [10][10];
        int [][] matriz2 = new int [3][3];
        
        //Matriz 10x10
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz1[i][j] = (int) Math.floor(Math.random()*9 + 1);
            }
        }
        
        //Matriz 3x3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = (int) Math.floor(Math.random()*9 + 1);
            }
        }
        
        //Desarrollo
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (true) {
                    
                }
            }
        }
        
        
        
        
        
        
        
        
        //Impresion de matrices
        //Matriz 10x10
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz1[i][j]);
            }
            System.out.println(" ");
        }
        
        System.out.println("");
        
        //Matriz 3x3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz2[i][j]);
            }
            System.out.println(" ");
        }
                
    }
    
}
