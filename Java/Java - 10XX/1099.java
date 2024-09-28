/*
Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. 
Cada caso de teste consiste de dois inteiros X e Y. 
Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. 
Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int entrada, i, x, y, impares;

        entrada = in.nextInt();

        for( i = 0; i < entrada; i++){
            impares = 0;
            x = in.nextInt();
            y = in.nextInt();
            
            if (x < y){
            for(x = x + 1; x < y; x++){
                if (x % 2 != 0){
                    impares += x;
                }
            }
        }
        
         if (x > y){
            for(x = x - 1; x > y; x--){
                if (x % 2 != 0){
                    impares += x;
                }
            }
        }

        System.out.printf("%d\n", impares);
        
        }
    }
}