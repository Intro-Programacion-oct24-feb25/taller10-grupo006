/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Problema08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};

        double[][] resultado = new double[2][3];
        String cadena = "";

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                if (i == 0 && j == 0) {
                    resultado[i][j] = dato1[i][j];
                } else {
                    if (i == 0 && j == 1) {
                        resultado[i][j] = dato2[i][j];
                    } else {
                        if (i == 0 && j == 2) {
                            resultado[i][j] = dato2[i][j];
                        } else {
                            if (i == 1 && j == 0) {
                                resultado[i][j] = dato1[i][j];
                            } else {
                                if (i == 1 && j == 1) {
                                    resultado[i][j] = dato1[i][j];
                                } else {
                                    if (i == 1 && j == 2) {
                                        resultado[i][j] = dato2[i][j];
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {

                cadena = String.format("%s%s\t",
                        cadena,
                        resultado[i][j]);

            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.printf("%s\n", cadena);
    }
}
