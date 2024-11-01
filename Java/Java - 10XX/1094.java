/*
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar 
os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias 
foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas 
informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia 
utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. 
Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias
utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada 
uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos 
após o ponto.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double entradas, cobaias, coelhos = 0, ratos = 0, sapos = 0, total = 0;
        String tipo;

        entradas = in.nextDouble();

        for(int i = 0; i < entradas; i++){
            cobaias = in.nextDouble();
            tipo = in.next();
            
            if (tipo.intern() == "C"){
                coelhos += cobaias;
            }else if (tipo.intern() == "R"){
                ratos += cobaias;
            }else if (tipo.intern() == "S"){
                sapos += cobaias;
            }
            total += cobaias;
        }     
        System.out.printf("Total: %.0f cobaias\n", total);
        System.out.printf("Total de coelhos: %.0f\n", coelhos);
        System.out.printf("Total de ratos: %.0f\n", ratos);
        System.out.printf("Total de sapos: %.0f\n", sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", (coelhos / total) * 100);
        System.out.printf("Percentual de ratos: %.2f %%\n", (ratos / total) * 100);
        System.out.printf("Percentual de sapos: %.2f %%\n", (sapos / total) * 100);
    }
}
