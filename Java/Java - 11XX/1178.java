/*
Leia um valor X. Coloque este valor na primeira posição de um vetor N[100]. 
Em cada posição subsequente de N (1 até 99), coloque a metade do valor armazenado na posição anterior, 
conforme o exemplo abaixo. Imprima o vetor N.

Entrada
A entrada contem um valor de dupla precisão com 4 casas decimais.

Saída
Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor
armazenado naquela posição. Cada valor do vetor deve ser apresentado com 4 casas decimais.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n[] = new double[100];

        n[0] = in.nextDouble();
        
        for(int i = 1; i < n.length; i++){
            n[i] = n[i-1] / 2;
        }

        for(int j = 0; j < n.length; j++){
            BigDecimal numero = new BigDecimal(n[j]);
            BigDecimal arredondado = numero.setScale(4, RoundingMode.HALF_DOWN);
            System.out.printf("N[%d] = %s\n", j, arredondado);
        }
    }
}