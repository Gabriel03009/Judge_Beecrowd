/*
Faça um algoritmo para ler um número indeterminado de dados, 
contendo cada um, a idade de um indivíduo. O último dado, 
que não entrará nos cálculos, contém o valor de idade negativa. 
Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. 
A entrada será encerrada quando um valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.
A média deve ser impressa com dois dígitos após o ponto decimal.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double entrada, media = 0, contador = 0;

        do{
            entrada = in.nextInt();

            if (entrada > 0){
                media += entrada;
                contador++;
            }
        }while(entrada > 0);

        System.out.printf("%.2f\n", media / contador);
    }
}