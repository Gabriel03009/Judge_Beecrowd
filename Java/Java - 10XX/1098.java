/*
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

I=0 J=1
I=0 J=2
I=0 J=3
I=0.2 J=1.2
I=0.2 J=2.2
I=0.2 J=3.2
.....
I=2 J=?
I=2 J=?
I=2 J=?

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {

        double i = 0;
        
        while (i < 1.8){
            for (double j = 1 + i; j <= 3 + i; j++){
                if (i % 1 == 0){
                    System.out.printf("I=%.0f J=%.0f\n", i, j);
                }else{
                    System.out.printf("I=%.1f J=%.1f\n", i, j);
                }
            }
            i += 0.2;
        }
        for (double j = 3; j <= 5; j++){
            System.out.printf("I=%.0f J=%.0f\n", i, j);
        }
    }
}
