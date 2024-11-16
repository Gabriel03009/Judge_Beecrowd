/*
Neste problema você deverá ler 15 valores colocá-los em 2 vetores conforme estes valores forem pares ou 
ímpares. Só que o tamanho de cada um dos dois vetores é de 5 posições. Então, cada vez que um dos dois 
vetores encher, você deverá imprimir todo o vetor e utilizá-lo novamente para os próximos números que forem 
lidos. Terminada a leitura, deve-se imprimir o conteúdo que restou em cada um dos dois vetores, 
imprimindo primeiro os valores do vetor impar. Cada vetor pode ser preenchido tantas vezes quantas for 
necessário.

Entrada
A entrada contém 15 números inteiros.

Saída
Imprima a saída conforme o exemplo abaixo.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int impar[] = new int[5];
        int par[] = new int[5];
        int x, p = 0, i = 0;

        do{
            x = in.nextInt();

            if( x % 2 == 0){
                par[p] = x;
                p++;
            }else if (x % 2 != 0){
                impar[i] = x;
                i++;
            }

            if(p == 5){
                for(int j = 0; j < par.length; j++){
                    System.out.printf("par[%d] = %d\n", j, par[j]);
                }
                p = 0;
            }

            if(i == 5){
                for(int j = 0; j < par.length; j++){
                    System.out.printf("impar[%d] = %d\n", j, impar[j]);
                }
                i = 0;
            }
        }while(in.hasNext());

        for (int j = 0; j < i; j++){
            System.out.printf("impar[%d] = %d\n", j, impar[j]);
        }

         for (int j = 0; j < p; j++){
            System.out.printf("par[%d] = %d\n", j, par[j]);
        }
    }
}