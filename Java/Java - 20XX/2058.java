/*
O professor Rafael adora computação gráfica. Ele gosta muito de renderizar objetos, especialmente bonecas. 
Mas ele não gosta de desenhar polígonos regulares usando triângulos. Fazer isso consiste em compor um polígono
regular usando apenas triângulos, de forma que os triângulos não se interceptem e se utilize o menor número 
possível de triângulos na composição. Veja um quadrado e um pentágono com os triângulos na figura.

https://resources.beecrowd.com/gallery/images/problems/UOJ_2058.png

O professor Rafael pediu para você calcular qual o número mínimo de triângulos necessários para compor um 
polígono regular de N lados.

Entrada
A entrada é composta por um número N (3 ≤ N ≤ 109), que indica o número de lados de um polígono regular.

Saída
A saída é o número mínimo de triângulos necessários para compor um polígono regular de N lados.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("%d\n", in.nextInt() - 2);
    }
}