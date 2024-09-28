/*
A fórmula para calcular a área de uma circunferência é: area = π . raio². 
Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π (pi).

Entrada
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

Saída
Apresentar a mensagem "A=" seguido pelo valor da variável area, com 4 casas após o ponto decimal. 
Utilize variáveis de dupla precisão (double).
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        double area, raio, pi;

        raio = in.nextDouble();
        pi = 3.14159;

        area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);
        
    }
}

