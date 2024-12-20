/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        double[][] notasCuantitativas = {{7.1, 8, 10},
        {3, 7, 9},
        {10, 9, 2.1}};
        double[] sumaNotas = new double[3];
        String[] notasCualitativas = new String[3];
        double promedio[] = new double[5];

        double suma;
        String cadena = "";

        for (int i = 0; i < notasCuantitativas.length; i++) {
            suma = 0;
            for (int j = 0; j < notasCuantitativas[i].length; j++) {
                suma = suma + notasCuantitativas[i][j];
            }
            sumaNotas[i] = suma; //
            promedio[i] = sumaNotas[i] / 3;

            if ((promedio[i] >= 0) && (promedio[i] < 3)) {
                notasCualitativas[i] = "Insuficiente";
            } else {
                if ((promedio[i] >= 3) && (promedio[i] < 5)) {
                    notasCualitativas[i] = "Regular";
                } else {
                    if ((promedio[i] >= 5) && (promedio[i] < 8)) {
                        notasCualitativas[i] = "Bueno";
                    } else {
                        if ((promedio[i] >= 8) && (promedio[i] < 9.6)) {
                            notasCualitativas[i] = "Muy Bueno";
                        } else {
                            if ((promedio[i] >= 9.6) && (promedio[i] <= 10)) {
                                notasCualitativas[i] = "Sobresaliente";
                            }
                        }
                    }
                }
            }

        }
        for (int i = 0; i < notasCuantitativas.length; i++) {
            cadena = String.format("%sEl promedio es: %.2f "
                    + "y nota cualitativa es: %s\n",
                    cadena,
                    promedio[i],
                    notasCualitativas[i]);
        }

        System.out.printf("%s\n", cadena);

    }
}
