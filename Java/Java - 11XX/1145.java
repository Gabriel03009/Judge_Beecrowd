/*
Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, 
passando para a próxima linha a cada X números.

Entrada
O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

Saída
Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, 
conforme exemplo abaixo. Não deve haver espaço em branco após o último valor da linha.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int limiteLinha, limiteNumero;

        limiteLinha = in.nextInt();
        limiteNumero = in.nextInt();

        for (int i = 1; i <= limiteNumero; i++){
            if(i != limiteNumero){
                if (i % limiteLinha != 0){
                    System.out.printf("%d ", i);
                }else{
                    System.out.printf("%d\n", i);
                }
            }else{
                System.out.printf("%d\n", i);
           }
        }
    }
}