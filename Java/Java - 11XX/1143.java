/*
Escreva um programa que leia um valor inteiro N (1 < N < 1000). 
Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int entrada, quadrado, cubo;

        entrada = in.nextInt();

        for (int i = 1; i <= entrada; i++){
            quadrado = (int) Math.pow(i, 2);
            cubo = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d\n", i, quadrado, cubo);
        }
    }
}