/*
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. 
Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão acima 
da diagonal principal da matriz, conforme ilustrado abaixo (área verde).

https://resources.beecrowd.com/gallery/images/problems/UOJ_1183.png

Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação 
(Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto 
flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double tabela[][] = new double [12][12];
        double saida = 0;
        String operacao;

        operacao = in.next();

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                tabela[i][j] = in.nextDouble();
            }
        }

        for(int i = 0; i < 12; i++){
            for(int j = 1 + i; j < 12; j++){
                saida += tabela[i][j];
            }
        }
        
        if(operacao.intern() == "S"){
            System.out.printf("%.1f\n", saida);
        }else if (operacao.intern() == "M"){
            saida = saida / 66;
            System.out.printf("%.1f\n", saida);
        }
    }
}