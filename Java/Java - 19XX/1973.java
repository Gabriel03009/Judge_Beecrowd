/*
Após comprar vários sítios adjacentes na região do oeste catarinense, a família Estrela construiu uma única 
estrada que passa por todos os sítios em sequência. O primeiro sítio da sequência foi batizado de Estrela 1, 
o segundo de Estrela 2, e assim por diante. Porém, o irmão que vive em Estrela 1 acabou enlouquecendo e 
resolveu fazer uma Jornada nas Estrelas para roubar carneiros das propriedades de seus irmãos. Mas ele está 
definitivamente pirado. Quando passa pelo sítio Estrela i, ele rouba apenas um carneiro daquele sítio 
(se o sítio tem algum) e segue ou para Estrela i + 1 ou para Estrela i - 1, dependendo se o número de 
carneiros em Estrela i era, respectivamente, ímpar ou par. Se não existe a Estrela para a qual ele deseja 
seguir, ele interrompe sua jornada. O irmão louco começa sua Jornada em Estrela 1, roubando um carneiro do seu próprio sítio.

Entrada
A primeira linha da entrada consiste de um único inteiro N (1 ≤ N ≤ 106), o qual representa o número de Estrelas. A segunda linha da entrada consiste de N inteiros, de modo que o i-ésimo inteiro, Xi (1 ≤ Xi ≤ 106), representa o número inicial de carneiros em Estrela i.

Saída
Imprima uma linha contendo dois inteiros, de modo que o primeiro represente o número de Estrelas atacadas pelo irmão louco e o segundo represente o número total de carneiros não roubados.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int quantidade = in.nextInt();
        int estrela[] = new int[quantidade];
        int contador[] = new int[quantidade];
        double total = 0;
        int atacadas = 0;

        for(int i = 0; i < estrela.length; i++){
            estrela[i] = in.nextInt();
            contador[i] = estrela[i];
            total += estrela[i];
        }
        int posicao = 0;
        double carneiros = 0;
        do{
            if(estrela[posicao] == 0){
                posicao = estrela.length;
            }else if(estrela[posicao] % 2 == 0){
                estrela[posicao]--;
                carneiros++;
                if(posicao == 0){
                    posicao = estrela.length;
                }else{
                    posicao--;
                }
            }else{
                estrela[posicao]--;
                carneiros++;
                posicao++;
            }           
        }while(posicao < estrela.length);

        for(int i = 0; i < estrela.length; i++){
            if(estrela[i] != contador[i]){
                atacadas++;
            }
        }

        System.out.printf("%d %.0f\n", atacadas, total - carneiros);
    }
}