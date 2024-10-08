/*
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. 
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11).
Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, 
com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. 
Utilize variáveis de dupla precisão (double).
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        double a, b, media;

        a = in.nextDouble() * 3.5;
        b = in.nextDouble() * 7.5;

        media = (a + b) / 11;

        System.out.printf("MEDIA = %.5f\n", media);
        
    }
}

