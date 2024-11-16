/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. 
Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, saida = 1; 

        n = in.nextInt();

        for(int i = 1; i <= n; i++){
            saida = i * saida;
        }

        System.out.printf("%d\n", saida);
            
    }
}