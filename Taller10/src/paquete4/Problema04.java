/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double[][] datos = new double[2][2];
        int fuera = 0;
        double valor;
        String cadena = "";

        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos[fila].length; col++) {
                System.out.println("Ingrese un valor");
                valor = entrada.nextInt();
                if (valor > 1000 && valor < 1199) {
                    datos[fila][col] = valor;
                } else {
                    datos[fila][col] = 10;
                    fuera = fuera + 1;
                }
            }
        }

        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos[fila].length; col++) {
                cadena = String.format("%s[%d] [%d] = %.2f\n",
                        cadena,
                        fila,
                        col,
                        datos[fila][col]);
            }
        }

        cadena = String.format("%sValores fuera del rango: %d",
                cadena,
                fuera);
        System.out.printf("%s\n",cadena);

    }
}   
    
