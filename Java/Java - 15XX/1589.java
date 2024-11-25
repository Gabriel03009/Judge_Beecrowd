/*
Você tem em mãos dois cabos circulares de energia. O primeiro cabo tem raio R1 e o segundo raio R2. 
Você precisa comprar um conduite circular (veja a imagem abaixo que ilustra um conduite) de maneira a 
passar os dois cabos por dentro dele:

https://resources.beecrowd.com/gallery/images/problems/UOJ_1589.jpg

Qual o menor raio do conduite que você deve comprar? Em outras palavras, dado dois círculos, qual o raio 
do menor círculo que possa englobar ambos os dois?

Entrada
Na primeira linha teremos um inteiro T (T ≤ 10000), indicando o número de casos de teste.
Na única linha de cada caso teremos dois números inteiros R1 e R2, indicando os respectivos raios. 
Os inteiros serão positivos e todas as contas caberão em um inteiro normal de 32 bits.

Saída
Em cada caso, imprima o menor raio possível em uma única linha
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int entradas = in.nextInt();

        for(int i = 0; i < entradas; i++){
            int r1 = in.nextInt();
            int r2 = in.nextInt();
            System.out.printf("%d\n", r1 + r2);
        }
    }
}