/*
Na matemática, um Número Primo é aquele que pode ser dividido somente por 1 (um) e por ele mesmo. 
Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo número 7.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 100), 
indicando o número de casos de teste da entrada. Cada uma das N linhas seguintes contém 
um valor inteiro X (1 < X ≤ 107), que pode ser ou não, um número primo.

Saída
Para cada caso de teste de entrada, imprima a mensagem “X eh primo” ou “X nao eh primo”, de acordo com 
a especificação fornecida.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, x;

        n = in.nextInt();

        for(int i = 0; i < n; i++){
            x = in.nextInt();
            boolean primo = true;

            for (int j = 2; j <= x / 2; j++){
                if(x % j == 0){
                    primo = false;
                }
            }

            if (primo){
                System.out.printf("%d eh primo\n", x);
            }else{
                System.out.printf("%d nao eh primo\n", x);
            }
        }
    }
}