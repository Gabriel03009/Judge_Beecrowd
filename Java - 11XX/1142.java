/*
Escreva um programa que leia um valor inteiro N. 
Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int entrada, contador = 1;

        entrada = in.nextInt();

        for(int i = 0; i < entrada; i ++){
            do{
                System.out.printf("%d ", contador);
                contador++;
            }while (contador % 4 != 0);
            contador++;
            System.out.printf("PUM\n");       
        }
    }
}