/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem 
“eh o maior”. Utilize a fórmula:

Maior AB = (a+b+abs(a-b)) / 2   

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, 
portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int a, b, c, maiorAB, maior;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        maiorAB = (a + b + Math.abs(a - b)) / 2;
        maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.printf("%d eh o maior\n", maior);
    }
}

