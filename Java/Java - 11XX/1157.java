/*
Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double entrada;
        
        entrada = in.nextInt();

        for(int i = 1; i <= entrada; i++){
            if (entrada % i == 0){
                System.out.printf("%d\n", i);
            }
        }
    }
}