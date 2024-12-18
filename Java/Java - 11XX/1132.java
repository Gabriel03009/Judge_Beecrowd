/*
Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são 
múltiplos de 13 entre X e Y, incluindo ambos.

Entrada
O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.

Saída
Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, 
inclusive ambos se for o caso.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y, soma = 0;

        x = in.nextInt();
        y = in.nextInt();
        
        if (x < y){
            for(x = x; x <= y; x++){
                if (x % 13 != 0){
                    soma += x;
                }
            }
        }else{
            for(y = y; y <= x; y++){
                if (y % 13 != 0){
                    soma += y;
                }
            }
        }

        System.out.printf("%d\n", soma);
        
    }
}