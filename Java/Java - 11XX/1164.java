/*
Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores positivos
próprios (excluindo ele mesmo) é igual ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6. 
Sua tarefa é escrever um programa que imprima se um determinado número é perfeito ou não.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 20), 
indicando o número de casos de teste da entrada. C
ada uma das N linhas seguintes contém um valor inteiro X (1 ≤ X ≤ 108), que pode ser ou não, um número perfeito.

Saída
Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito” ou “X nao eh perfeito”, de acordo com a especificação fornecida.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int entrada, casos, soma;

        casos = in.nextInt();

        for(int i = 0; i < casos; i++){
            entrada = in.nextInt();
            soma = 0;
            
            for (int j = 1; j < entrada; j++){
                if (entrada % j == 0){
                    soma += j;
                }
            }
            if (soma == entrada){
                System.out.printf("%d eh perfeito\n", entrada);          
            }else{
                System.out.printf("%d nao eh perfeito\n", entrada);
            }
        }
    }
}