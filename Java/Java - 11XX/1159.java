/*
O programa deve ler um valor inteiro X indefinidas vezes (O programa irá parar quando o valor de X for igual a 0). 
Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X, se for par. 
Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação: 4+6+8+10+12, 
enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80, que é a soma de 12+14+16+18+20.

Entrada
O arquivo de entrada contém muitos valores inteiros. O último valor do arquivo é zero.

Saída
Imprima a saida conforme a explicação acima e o exemplo abaixo.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double entrada, ajuste;

        do{

            entrada = in.nextDouble();
            
            if(entrada != 0){
                ajuste = entrada;
                if (ajuste % 2 != 0){
                    ajuste++;
                }
                double a = ajuste + (5 - 1.0) * 2.0;
                double soma = 5 * (ajuste + a) / 2.0;

                System.out.printf("%.0f\n", soma);
            }
        }while (entrada != 0);
    }
}