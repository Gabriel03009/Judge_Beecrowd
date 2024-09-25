/*
Leia quatro valores inteiros A, B, C e D. 
A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int a, b, c, d, diferenca;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();

        diferenca = (a * b - c * d);

        System.out.printf ("DIFERENCA = %d\n", diferenca);
            
    }
}


