/*
A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. 
Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. 
Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 46).

Saída
Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. 
Não deve haver espaço após o último valor.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n; 
        int anterior = 0, atual = 1, posterior = 1; 

        n = in.nextInt();

        System.out.printf("0");

        for(int i = 0; i < n - 1; i++){
            System.out.printf(" %d", atual);
            atual = posterior;
            anterior = atual - anterior;
             posterior = anterior + atual;
        }
        
        System.out.printf("\n");
        
    }
}