/*
Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?

Entrada
Não há nenhuma entrada neste problema.

Saída
A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o ponto decimal.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double s = 1, numerador = 3, denominador = 2; 

        do{
            s += (numerador / denominador);
            numerador += 2;
            denominador = denominador * 2;
        }while (numerador <= 39);

        System.out.printf("%.2f\n", s);
            
    }
}