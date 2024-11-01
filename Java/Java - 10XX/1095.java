/*
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

I=1 J=60
I=4 J=55
I=7 J=50
...
I=? J=0

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {

        int i = 1, j = 60;

        do{
            System.out.printf("I=%d J=%d\n", i, j);
            i += 3;
            j -= 5;
        }while (j >= 0);
    }
}
