/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
Apresente a média ponderada para cada um destes conjuntos de 3 valores, 
sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Entrada
O arquivo de entrada contém um valor inteiro N na primeira linha. 
Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.

Saída
Para cada caso de teste, imprima a média ponderada dos 3 valores.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int entrada, i;
        double valor1, valor2, valor3, media;

        entrada = in.nextInt();

        for( i = 0; i < entrada; i++){
            valor1 = in.nextDouble() * 2;
            valor2 = in.nextDouble() * 3;
            valor3 = in.nextDouble() * 5;

            media = (valor1 + valor2 + valor3) / 10;

            System.out.printf("%.1f\n", media);
        }
    }
}