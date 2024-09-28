/*
Leia um conjunto não determinado de pares de valores M e N 
(parar quando algum dos valores for menor ou igual a zero).
Para cada par lido, mostre a sequência do menor até o maior e a soma 
dos inteiros consecutivos entre eles (incluindo o N e M).

Entrada
O arquivo de entrada contém um número não determinado de valores M e N. 
A última linha de entrada vai conter um número nulo ou negativo.

Saída
Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m;
        int n;
        int soma;

        do{
            m = in.nextInt();
            n = in.nextInt();
            soma = 0;

            if (m > 0 && n > 0){
                if(m >= n){
                    for (n = n; n <= m; n++){
                        System.out.printf("%d ", n);
                        soma += n;
                    }
                    System.out.printf("Sum=%d\n", soma);
                }else if(m < n){
                    for (m = m; m <= n; m++){
                        System.out.printf("%d ", m);
                        soma += m;
                    }
                    System.out.printf("Sum=%d\n", soma);
                }
            }        
        }while (m > 0 && n > 0);
    }
}