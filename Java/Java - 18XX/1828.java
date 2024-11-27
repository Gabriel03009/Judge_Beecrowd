/*
No oitavo episodio da segunda temporada do seriado The Big Bang Theory, The Lizard-Spock Expansion, Sheldon e 
Raj discutem qual dos dois é o melhor: o filme Saturn 3 ou a série Deep Space 9. A sugestão de Raj para a 
resolução do impasse é uma disputa de Pedra-Papel-Tesoura. Contudo, Sheldon argumenta que, se as partes 
envolvidas se conhecem, entre 75% e 80% das disputas de Pedra-Papel-Tesoura terminam empatadas, e então 
sugere o Pedra-Papel-Tesoura-Lagarto-Spock.

As regras do jogo proposto são:

1. a tesoura corta o papel;
2. o papel embrulha a pedra;
3. a pedra esmaga o lagarto;
4. o lagarto envenena Spock;
5. Spock destrói a tesoura;
6. a tesoura decapita o lagarto;
7. o lagarto come o papel;
8. o papel contesta Spock;
9. Spock vaporiza a pedra;
10. a pedra quebra a tesoura.

Embora a situação não se resolva no episódio (ambos escolhem Spock, resultando em um empate), não é difıcil 
deduzir o que aconteceria se a disputa continuasse. Caso Sheldon vencesse, ele se deleitaria com a vitória, 
exclamando "Bazinga!"; caso Raj vencesse, ele concluiria que "Raj trapaceou!"; caso o resultado fosse empate, 
ele exigiria nova partida: "De novo!". Conhecidas as personagens do jogo escolhido por ambos, faça um 
programa que imprima a provável reação de Sheldon.

Entrada
A entrada consiste em uma série de casos de teste. A primeira linha contém um inteiro positivo T (T ≤ 100), 
que representa o número de casos de teste. Cada caso de teste é representado por uma linha da entrada, 
contendo as escolhas de Sheldon e Raj, respectivamente, separadas por um espaço em branco. As escolha 
possíveis são as personagens do jogo: pedra, papel, tesoura, lagarto e Spock.

Saida
Para cada caso de teste deverá ser impressa a mensagem "Caso #t: R", onde t é o número do caso de teste 
(cuja contagem se inicia no número um) e R é uma das três reações possíveis de Sheldon: "Bazinga!", 
"Raj trapaceou!", ou "De novo!".
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();

        for(int i = 1; i <= casos; i++){
            String p1 = in.next();
            String p2 = in.next();

            switch(p1){
                case "pedra":
                    if(p2.intern() == "pedra"){
                    System.out.printf("Caso #%d: De novo!\n", i);
                    }else if(p2.intern() == "lagarto" || p2.intern() == "tesoura"){
                    System.out.printf("Caso #%d: Bazinga!\n", i);
                    }else{
                    System.out.printf("Caso #%d: Raj trapaceou!\n", i);
                    }
                break;
                case "papel":
                    if(p2.intern() == "papel"){
                    System.out.printf("Caso #%d: De novo!\n", i);
                    }else if(p2.intern() == "pedra" || p2.intern() == "Spock"){
                    System.out.printf("Caso #%d: Bazinga!\n", i);
                    }else{
                    System.out.printf("Caso #%d: Raj trapaceou!\n", i);
                    }
                break;
                case "tesoura":
                    if(p2.intern() == "tesoura"){
                    System.out.printf("Caso #%d: De novo!\n", i);
                    }else if(p2.intern() == "papel" || p2.intern() == "lagarto"){
                    System.out.printf("Caso #%d: Bazinga!\n", i);
                    }else{
                    System.out.printf("Caso #%d: Raj trapaceou!\n", i);
                    }
                break;
                case "lagarto":
                    if(p2.intern() == "lagarto"){
                    System.out.printf("Caso #%d: De novo!\n", i);
                    }else if(p2.intern() == "Spock" || p2.intern() == "papel"){
                    System.out.printf("Caso #%d: Bazinga!\n", i);
                    }else{
                    System.out.printf("Caso #%d: Raj trapaceou!\n", i);
                    }
                break;
                case "Spock":
                    if(p2.intern() == "Spock"){
                    System.out.printf("Caso #%d: De novo!\n", i);
                    }else if(p2.intern() == "tesoura" || p2.intern() == "pedra"){
                    System.out.printf("Caso #%d: Bazinga!\n", i);
                    }else{
                    System.out.printf("Caso #%d: Raj trapaceou!\n", i);
                    }
                break;
            }
        }      
    }
}