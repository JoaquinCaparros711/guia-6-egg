/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

/**
 *
 * @author WIN11
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int aux, unDigito, dosDigito, tresDigito, cuatroDigito, cincoDigito;
        unDigito = 0;
        dosDigito = 0;
        tresDigito = 0;
        cuatroDigito = 0;
        cincoDigito = 0;
        
        int[] vector = new int[10000];
        String[] vectorCadena = new String[10000];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100000 + 1);
        }
        
        for (int i = 0; i < vector.length; i++) {
            vectorCadena[i] = String.valueOf(vector[i]);
        }
        
        for (int i = 0; i < vector.length; i++) {
            
            String num = vectorCadena[i];
            
            aux = num.length();
            
            switch (aux) {
                case 1:
                    unDigito ++;
                    continue;
                case 2:
                    dosDigito ++;
                    continue;
                case 3:
                    tresDigito ++;
                    continue;
                case 4:
                    cuatroDigito ++;
                    continue;
                case 5:
                    cincoDigito ++;
                    continue;
                default:
                    System.out.println("Mas de 5 digitos");
            }
            
        }

        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        
        System.out.println(" ");
        
        System.out.println("Numeros con un digito: " + unDigito );
        System.out.println("Numeros con dos digitos: " + dosDigito );
        System.out.println("Numeros con tres digitos: " + tresDigito );
        System.out.println("Numeros con cuatro digitos: " + cuatroDigito );
        System.out.println("Numeros con cinco digitos: " + cincoDigito );
        
    }
    
}
