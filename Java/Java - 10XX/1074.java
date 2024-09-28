/*
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. 
Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), 
positivo (POSITIVE) ou negativo (NEGATIVE). 
No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), 
pois por definição zero é par, seu programa deverá imprimir apenas NULL.

Entrada
A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. 
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).

Saída
Para cada caso, imprima uma mensagem correspondente. Todas as letras deverão ser maiúsculas e sempre 
deverá haver um espaço entre duas palavras 
impressas na mesma linha.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int entradas, valor;

        entradas = in.nextInt();

        for(int i = 0; i < entradas; i++){
            valor = in.nextInt();

            if(valor == 0){
                System.out.printf("NULL\n");
            }else if (valor % 2 == 0){
                System.out.printf("EVEN ");
            }else if (valor % 2 != 0){
                System.out.printf("ODD ");
            }

            if(valor > 0){
                System.out.printf("POSITIVE\n");
            }else if (valor < 0 ){
                System.out.printf("NEGATIVE\n");
            }
        }
    }
}