/*
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=7
I=3 J=6
I=3 J=5
...
I=9 J=7
I=9 J=6
I=9 J=5

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

        int i = 1;

        do{
            for (int j = 7; j >= 5; j--){
                System.out.printf("I=%d J=%d\n", i, j);
            }
            i += 2;
        }while (i <= 9);
    }
}
