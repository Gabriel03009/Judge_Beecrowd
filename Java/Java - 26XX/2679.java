/*
Para se preparar para os outros problemas, vamos fazer um teste. Dado um número X, retorne o menor 
número par maior do que X.

Entrada
Uma linha contendo um número  0 < X < 10^7.

Saída
Uma linha contendo a resposta do problema.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        if(x % 2 != 0){
            System.out.printf("%d\n", x + 1);
        }else{
             System.out.printf("%d\n", x + 2);
        }
    }
}