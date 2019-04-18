/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Clase23 {
    
    public static void main(String[] args) {
        // uso de cast
        
        int valor1 = 10;
        String cadena = "10.293";
        
        System.out.printf("%.2f\n", (double)(valor1));
        System.out.printf("%.2f\n", Double.parseDouble(cadena));
    }
    
}
