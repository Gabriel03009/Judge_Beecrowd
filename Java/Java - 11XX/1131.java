/*
A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do 
resultado de vários GRENAIS. Escreva um programa para ler o número de gols marcados pelo Inter e pelo 
Grêmio em um GRENAL. Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. 
Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de gols marcados pelos 
times em uma nova partida, caso contrário deve ser encerrado imprimindo:

- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", 
caso termine empatado).

Entrada
O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados pelo Inter e 
pelo Grêmio respectivamente. Em seguida háverá um inteiro (1 ou 2), correspondente à repetição do programa.

Saída
Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". 
Quando o algoritmo for encerrado devem ser mostradas as estatísticas conforme a descrição apresentada acima. 
Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int golInter, golGremio, novoGrenal;
        int vitoriasInter = 0, vitoriasGremio = 0, total = 0, empate = 0;
        
        do{
            total ++;
            golInter = in.nextInt();
            golGremio = in.nextInt();

            if(golInter > golGremio){
                vitoriasInter++;
            }else if(golGremio > golInter){
                vitoriasGremio++;
            }else{
                empate++;
            }

            do{
                System.out.printf("Novo grenal (1-sim 2-nao)\n");
                novoGrenal = in.nextInt();
            }while(novoGrenal < 1 || novoGrenal > 2);
        }while(novoGrenal == 1);

        System.out.printf("%d grenais\n", total);
        System.out.printf("Inter:%d\n", vitoriasInter);
        System.out.printf("Gremio:%d\n", vitoriasGremio);
        System.out.printf("Empates:%d\n", empate);
        if (vitoriasInter > vitoriasGremio){
            System.out.printf("Inter venceu mais\n");
        }else{
            System.out.printf("Gremio venceu mais\n");
        }
    }
}