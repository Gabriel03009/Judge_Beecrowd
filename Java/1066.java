/*
Leia 5 valores Inteiros. 
A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, 
quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, 
não esquecendo o final de linha após cada uma.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int entrada[] = new int[5];
        int par, impar, positivo, negativo;

        par = 0;
        impar = 0;
        positivo = 0;
        negativo = 0;

        for (int i = 0; i < entrada.length; i++){
            entrada[i] = in.nextInt();

            if (entrada[i] % 2 == 0){
                par++;
            }
            if (entrada[i] % 2 != 0){
                impar++;
            }
            if (entrada[i] > 0){
                positivo++;
            }
            if (entrada[i] < 0){
                negativo++;
            }
        }

        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", positivo);
        System.out.printf("%d valor(es) negativo(s)\n", negativo);
        
    }
}