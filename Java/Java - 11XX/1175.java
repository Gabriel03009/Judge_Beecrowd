/*
Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, 
o segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.

Entrada
A entrada contém 20 valores inteiros, positivos ou negativos.

Saída
Para cada posição do vetor N, escreva "N[i] = Y", 
onde i é a posição do vetor e Y é o valor armazenado naquela posição.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double n[] = new double[20];
        
        for (int i = 19; i >= 0; i--){
            n[i] = in.nextDouble();
        }
        
        for (int i = 0; i < 20; i++){
            System.out.printf("N[%d] = %.0f\n", i, n[i]);
        }
    }
}