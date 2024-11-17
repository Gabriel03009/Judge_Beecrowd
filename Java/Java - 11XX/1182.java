/*
Neste problema você deve ler um número que indica uma coluna de uma matriz na qual uma operação deve ser 
realizada, um caractere maiúsculo, indicando a operação que será realizada, e todos os elementos de uma 
matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média dos elementos que estão na área verde da 
matriz, conforme for o caso. A imagem abaixo ilustra o caso da entrada do valor 5 para a coluna da matriz, 
demonstrando os elementos que deverão ser considerados na operação.

https://resources.beecrowd.com/gallery/images/problems/UOJ_1182.png

Entrada
A primeira linha de entrada contem um número C (0 ≤ C ≤ 11) indicando a coluna que será considerada para 
operação. A segunda linha de entrada contém um único caractere Maiúsculo T ('S' ou 'M'), indicando a 
operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de 
ponto flutuante que compõem a matriz.

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
        int c;
        double saida = 0;
        String operacao;

        c = in.nextInt();
        operacao = in.next();

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                tabela[i][j] = in.nextDouble();
            }
        }

        if(operacao.intern() == "S"){
            for(int j = 0; j < 12; j++){
                saida += tabela[j][c];
            }
        }else if (operacao.intern() == "M"){
             for(int j = 0; j < 12; j++){
                saida += tabela[j][c];
            }
            saida = saida / 12;
        }

        System.out.printf("%.1f\n", saida);
    }
}