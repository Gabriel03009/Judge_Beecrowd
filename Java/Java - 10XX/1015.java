/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, 
p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais, segundo a fórmula:

Distancia = √((x2-x1)² + (y2-y1)²)

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto 
flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, considerando 4 casas decimais.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double x, x1, x2, y, y1, y2, distancia;

        x1= in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();

        x = Math.pow (x1 - x2, 2);
        y = Math.pow (y1 - y2, 2);

        distancia = Math.sqrt(x + y);

        System.out.printf("%.4f\n", distancia);
    }
}

