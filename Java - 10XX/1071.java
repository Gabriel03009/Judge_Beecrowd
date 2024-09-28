/*
Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. 
Este valor é a soma dos valores ímpares que estão entre os valores 
fornecidos na entrada que deverá caber em um inteiro.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y, impares = 0;

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