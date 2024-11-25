/*
O seu professor de programação gostaria que você fizesse um programa com as seguintes características:

Crie vinte e seis variáveis inteira;
Atribua a primeira variável o valor 97;
Atribua as outras demais variável o valor da primeira somado de uma unidade;
Mostre na tela os valores numéricos da primeira variável, um espaço em braco, o carácter 'e', outro espaço em branco e o seu valor alfanumérico (caracteres);
Repita o procedimento para todas as outras variáveis.
Entrada
Não há.

Saída
O resultado de seu programa deve ser o mesmo do exemplo de saída.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int i = 97; i < 123; i++)
            System.out.printf("%s e %c\n", i, i);
    }
}