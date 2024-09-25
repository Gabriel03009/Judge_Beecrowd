/*
Faça um programa que leia 5 valores inteiros. 
Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int entrada[] = new int[5];
        int contador = 0;
            
            for (int i = 0; i < entrada.length; i++){
            entrada[i] = in.nextInt();
            if (entrada[i] % 2 == 0){
                contador++;
            }
        }
        
        System.out.printf("%d valores pares\n",contador);
        
    }
}