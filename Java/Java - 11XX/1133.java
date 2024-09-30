/*
Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre
eles cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.

Entrada
O arquivo de entrada contém 2 valores positivos inteiros quaisquer, 
não necessariamente em ordem crescente.

Saída
Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int x, y;

        x = in.nextInt();
        y = in.nextInt();

        if (x < y){
            for (x = x + 1; x < y; x++){
                if (x % 5 == 2 || x % 5 == 3){
                    System.out.printf("%d\n", x);
                }
            }
        }
        if (x > y){
            for (y = y + 1; y < x; y++){
                if (y % 5 == 2 || y % 5 == 3){
                    System.out.printf("%d\n", y);
                }
            }
        }
    }
}