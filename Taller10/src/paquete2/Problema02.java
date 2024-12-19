/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String [] vendedores = {"Jessica Cole","Robert Wallace"};
        int [][] ventas = new int [2][5];
        String [] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes"};
        int ventas1 = 0;
        String cadena = "";
        int totalV = 0;
        
        for(int fila = 0; fila < 2; fila++){
            for(int col = 0 ; col < 5; col++){
                System.out.println("Ingrese las ventas del dia " + dias[col]+
                        " del vendedor: " + vendedores[fila]);
                ventas1 = entrada.nextInt();
                ventas[fila][col] = ventas1;
                totalV = totalV + ventas[fila][col];
            }
            cadena = String.format("%sVendedor(a) %s\n", 
                    cadena,
                    vendedores[fila]);
        }
        cadena = String.format ("%sHan realizado un total de: %d en ventas\n",
                cadena,
                totalV);
        System.out.printf("%s\n",cadena);
    }
}
