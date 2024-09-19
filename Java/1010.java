/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". 
O valor deverá ser apresentado com 2 casas após o ponto.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int A, B, D, E;
        double C, F, P1, P2, TOTAL;

        A = in.nextInt();
        B = in.nextInt();
        C = in.nextDouble();
        D = in.nextInt();
        E = in.nextInt();
        F = in.nextDouble();

        P1 = B * C;
        P2 = E * F;
        TOTAL= P1 + P2;

        System.out.printf ("VALOR A PAGAR: R$ %.2f\n", TOTAL);
            
    }
}