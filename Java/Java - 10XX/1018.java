/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) 
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, 
conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, 
caso contrário seu programa apresentará a mensagem: “Presentation Error”.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int D, d100, d50, d20, d10, d5, d2;
       
        D = in.nextInt();
        System.out.printf("%d\n", D);
        
        d100 = D / 100;
        D = D - (d100 * 100);
        d50 = D / 50;
        D = D - (d50 * 50);
        d20 = D / 20;
        D = D - (d20 * 20);
        d10 = D / 10;
        D = D - (d10 * 10);
        d5 = D / 5;
        D = D - (d5 * 5);
        d2 = D / 2;
        D = D - (d2 * 2);

        
        System.out.printf("%d nota(s) de R$ 100,00\n", d100);
        System.out.printf("%d nota(s) de R$ 50,00\n", d50);
        System.out.printf("%d nota(s) de R$ 20,00\n", d20);
        System.out.printf("%d nota(s) de R$ 10,00\n", d10);
        System.out.printf("%d nota(s) de R$ 5,00\n", d5);
        System.out.printf("%d nota(s) de R$ 2,00\n", d2);
        System.out.printf("%d nota(s) de R$ 1,00\n", D);
    }
}

