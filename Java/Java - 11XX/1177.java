/*
Faça um programa que leia um valor T e preencha um vetor N[1000]
com a sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.

Entrada
A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

Saída
Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e x é o valor 
armazenado naquela posição.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int n[] = new int[1000];
        int entrada, contador = 0;

        entrada = in.nextInt();
        
        for (int i = 0; i < n.length; i++){
            n[i] = contador;
            contador++;
            if(contador == entrada){
                contador = 0;
            }
            System.out.printf("N[%d] = %d\n", i, n[i]);
        }
    }
}