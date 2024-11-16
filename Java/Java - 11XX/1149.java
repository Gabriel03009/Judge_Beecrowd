/*
Faça um algoritmo para ler um valor A e um valor N. Imprimir a soma de A + i para cada i com os valores 
(0 <= i <= N-1). Enquanto N for negativo ou ZERO, um novo N(apenas N) deve ser lido.

Entrada
A entrada contém somente valores inteiros, podendo ser positivos ou negativos. Todos os valores estão na 
mesma linha.

Saída
A saída contém apenas um valor inteiro.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, n, i = 0;

            a = in.nextInt();        

        do{
            n = in.nextInt();
   
        }while (n <= 0);

        for (int j = 0; j < n; j++){
                    i += j  + a;
                }

        System.out.printf("%d\n", i);
        
    }
}