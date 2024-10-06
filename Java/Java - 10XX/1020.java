/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. 
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int dia, mes, ano;

        dia = in.nextInt();

        ano = dia / 365;
        dia = dia - (ano * 365);
        mes = dia / 30;
        dia = dia - (mes * 30);
        
        System.out.printf("%d ano(s)\n", ano);
        System.out.printf("%d mes(es)\n", mes);
        System.out.printf("%d dia(s)\n", dia);
    }
}

