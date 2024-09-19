/*
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
A seguir mostre a variável PROD com mensagem correspondente.   

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "PROD" e a variável PROD, com um espaço em branco antes e depois da igualdade.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        int A, B, PROD;

        A = in.nextInt();
        B = in.nextInt();

        PROD = A * B;
        
        System.out.printf("PROD = %d\n", PROD);
        
    }
}

