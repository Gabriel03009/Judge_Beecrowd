/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. 
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 
1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, 
conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double Not100, Not50, Not20, Not10, Not5, Not2, Moe1, Moe50, Moe25, Moe10, Moe5, Moe01, Total;

        Total = in.nextDouble() * 100;

        Not100 = (int)(Total / 10000);
        Total = Total - (Not100 * 10000);
        Not50 = (int)(Total / 5000);
        Total = Total - (Not50 * 5000);
        Not20 = (int)(Total / 2000);
        Total = Total - (Not20 * 2000);
        Not10 = (int)(Total / 1000);
        Total = Total - (Not10 * 1000);
        Not5 = (int)(Total / 500);
        Total = Total - (Not5 * 500);
        Not2 = (int)(Total / 200);
        Total = Total - (Not2 * 200);
        Moe1 = (int)(Total / 100);
        Total = Total - (Moe1 * 100);
        Moe50 = (int)(Total / 50);
        Total = Total - (Moe50 * 50);
        Moe25 = (int)(Total / 25);
        Total = Total - (Moe25* 25);
        Moe10 = (int)(Total / 10);
        Total = Total - (Moe10 * 10);
        Moe5 = (int)(Total / 5);
        Total = Total - (Moe5 * 5);
        Moe01 = (int)(Total / 1);
        Total = Total - (Moe01 * 1);
        
        System.out.printf("NOTAS:\n");
        System.out.printf("%.0f nota(s) de R$ 100.00\n", Not100);
        System.out.printf("%.0f nota(s) de R$ 50.00\n", Not50);
        System.out.printf("%.0f nota(s) de R$ 20.00\n", Not20);
        System.out.printf("%.0f nota(s) de R$ 10.00\n", Not10);
        System.out.printf("%.0f nota(s) de R$ 5.00\n", Not5);
        System.out.printf("%.0f nota(s) de R$ 2.00\n", Not2);
        System.out.printf("MOEDAS:\n");
        System.out.printf("%.0f moeda(s) de R$ 1.00\n", Moe1);
        System.out.printf("%.0f moeda(s) de R$ 0.50\n", Moe50);
        System.out.printf("%.0f moeda(s) de R$ 0.25\n", Moe25);
        System.out.printf("%.0f moeda(s) de R$ 0.10\n", Moe10);
        System.out.printf("%.0f moeda(s) de R$ 0.05\n", Moe5);
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", Moe01);
    }
}