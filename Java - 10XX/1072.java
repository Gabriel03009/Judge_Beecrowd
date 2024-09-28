/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, 
mostrando essas informações.

Entrada
A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 

Saída
Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int entradas, valor, in = 0, out = 0, i = 0;

        entradas = read.nextInt();

        for(i = i; i < entradas; i++){
            valor = read.nextInt();

            if(valor >=10 && valor <=20){
                in++;
            }else{
                out++;
            }
        }

        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out); 

    }
}