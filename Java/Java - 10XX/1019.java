/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, 
e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), 
convertido para horas:minutos:segundos, conforme exemplo fornecido.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int segundos, minutos, horas;

        segundos = in.nextInt();

        minutos = segundos / 60;
        segundos = segundos - (minutos * 60);
        horas= minutos / 60;
        minutos = minutos - (horas * 60);
        
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}

