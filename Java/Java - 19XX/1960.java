/*
A ECI (Editio Chronica Incredibilis ou Editora de Crônicas Incríveis) é muito tradicional quando se trata 
de numerar as páginas de seus livros. Ela sempre usa a numeração romana para isso. 
E seus livros nunca ultrapassam as 999 páginas pois, quando necessário, dividem o livro em volumes.

Você deve escrever um programa que, dado um número arábico, mostra seu equivalente na numeração romana.

Lembre que I representa 1, V é 5, X é 10, L é 50, C é 100, D é 500 e M representa 1000.

Entrada
A entrada é um número inteiro positivo N (0 < N < 1000).

Saída
A saída é o número N escrito na numeração romana em uma única linha. Use sempre letras maiúsculas.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String centena[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM", "M"};
        String dezena[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String unidade[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String saida = "";
        int numero, numCentena, numDezena, numUnidade;

        numero = in.nextInt();

        numCentena = numero /100;
        numDezena = (numero % 100) / 10;
        numUnidade = (numero % 100) % 10;

        saida = String.format("%s", centena[numCentena]);
        saida = String.format("%s%s", saida, dezena[numDezena]);
        saida = String.format("%s%s\n", saida, unidade[numUnidade]);

        System.out.printf(saida);
    }
}