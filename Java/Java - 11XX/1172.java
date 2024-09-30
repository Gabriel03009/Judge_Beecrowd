/*
Faça um programa que leia um vetor X[10]. 
Substitua a seguir, todos os valores nulos e negativos do vetor X por 1. E
m seguida mostre o vetor X.

Entrada
A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

Saída
Para cada posição do vetor, escreva "X[i] = x", 
onde i é a posição do vetor e x é o valor armazenado naquela posição.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int x[] = new int[10];
            
            for (int i = 0; i < x.length; i++){
            x[i] = in.nextInt();
            
            if (x[i] < 1){
                x[i] = 1;
            }

            System.out.printf("X[%d] = %d\n", i, x[i]);
        }
    }
}