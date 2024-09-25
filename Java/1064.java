/*
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, 
com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. 
Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. 
A próxima linha deve mostrar a média dos valores positivos digitados.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double entrada[] = new double[6];
        int contador = 0; 
        double media = 0;

        for (int i = 0; i < entrada.length; i++){
            entrada[i] = in.nextDouble();
            
            if (entrada[i] > 0){
                contador++;
                media += entrada[i];              
            }
        }

        media = media / contador;
        
        System.out.printf("%d valores positivos\n", contador);
        System.out.printf("%.1f\n", media);
        
    }
}