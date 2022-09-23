/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author WIN11
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int[][] matriz2 = new int[3][3];
        
        int num, sumaLinea1, aux, sumaLinea2, sumaLinea3, sumaCol1, sumaCol2, sumaCol3, sumaDiag1, sumaDiag2;
        sumaLinea1 = 0;
        sumaLinea2 = 0;
        sumaLinea3 = 0;
        sumaCol1 = 0;
        sumaCol2 = 0;
        sumaCol3 = 0;
        sumaDiag1 = 0;
        sumaDiag2 = 0;
        aux = 0;
        
        // Matriz ingresada por teclado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero para la posicion de fila " + i + " la de columna " + j);
                num = leer.nextInt();
                if ( num > 0 && num < 10 ) {
                    matriz[i][j] = num;
                } else {
                    System.out.println("El numero ingresado debe ser del 1 al 9, su numero se tomara como 0");
                }
            }
        }
        
        //Matriz transpuesta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[j][i] = matriz[i][j];
            }
        }
        
        //Desarrollo Lineas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (i) {
                    case 0:
                        sumaLinea1 = sumaLinea1 + matriz[i][j];
                        break;
                    case 1:
                        sumaLinea2 = sumaLinea2 + matriz[i][j];
                        break;
                    case 2:
                        sumaLinea3 = sumaLinea3 + matriz[i][j];
                        break;
                }
            }
        }
        
        //Desarrollo Columnas
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (i) {
                    case 0:
                        sumaCol1 = sumaCol1 + matriz2[i][j];
                        break;
                    case 1:
                        sumaCol2 = sumaCol2 + matriz2[i][j];
                        break;
                    case 2:
                        sumaCol3 = sumaCol3 + matriz2[i][j];
                        break;
                }
            }
        }
        
        //Desarrollo Diagonales
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ( i == j ) {
                    sumaDiag1 = sumaDiag1 + matriz[i][j];
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ( i == 0 && j == 2 ) {
                    sumaDiag2 = sumaDiag2 + matriz[i][j];
                } else if ( i == 1 && j == 1 ) {
                    sumaDiag2 = sumaDiag2 + matriz[i][j];
                } else if ( i == 2 && j == 0 ) {
                    sumaDiag2 = sumaDiag2 + matriz[i][j];
                }
            }
        }
        
        //Impresion de las matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
        
        //Desarrollo final de si es magico o no
        if ( sumaLinea1 == sumaLinea2 && sumaLinea1 == sumaLinea3 && sumaLinea1 == sumaCol1 && sumaLinea1 == sumaCol2 && sumaLinea1 == sumaCol3 && sumaLinea1 == sumaDiag1 && sumaLinea1 == sumaDiag2) {
            System.out.println("El cuadrado es MAGICO");
        } else{
            System.out.println("El cuadrado No es magico");
        }
        
        
        
    }
    
}
