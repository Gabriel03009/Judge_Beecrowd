/*
Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. 
Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

Entrada
A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) 
que serão lidos em seguida.

Saída
Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” 
caso não seja possível efetuar o cálculo.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double entrada, x, y;
        
        entrada = in.nextDouble();

        for(int i = 0; i < entrada; i++){
            x = in.nextDouble();
            y = in.nextDouble();

            if(y != 0){
                System.out.printf("%.1f\n", x / y);
                }else{
                System.out.printf("divisao impossivel\n");
                }
        }
    }
}