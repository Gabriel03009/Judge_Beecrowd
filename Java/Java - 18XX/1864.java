/*
E aí? Curtiu a Escola de Inverno deste ano? Para que esta Escola acontecesse, foram muitos que trabalharam, 
seja na elaboração dos problemas, na configuração do Portal, na logística do evento ou na captação dos 
recursos. Nosso agradecimento especial deste ano vai para o Prof. Ricardo Oliveira, que não somente aceitou 
vir ministrar as oficinas como também participou ativamente na organização da Escola. Temos certeza que a 
experiência e a carreira dele no ICPC como competidor e como coach motivaram e inspiraram todos nós.

Esperamos que você tenha gostado desses últimos dias em Essos e em Westeros, que tenha aprendido bastante e 
que tenha se divertido. Mas não é só em Essos e em Westeros que você deve se divertir. Aqui, em Além da 
Muralha, programar também é divertido. Continue estudando, continue treinando, e cada vez mais. O importante 
é o caminho que você vai trilhar daqui para frente. Nosso conselho é que você procure sempre aproveitar ao 
máximo cada momento, cada oficina, cada escola, cada treino, cada tempo de prática ou estudo em casa. 
Nossos dias nunca voltarão.

Frase: LIFE IS NOT A POBLEM TO BE SOLVED

Entrada
A entrada consiste de um único inteiro N (1 ≤ N ≤ 34) numa linha.

Saída
Imprima os N primeiros caracteres da citação de Søren Kierkegaard definida pelas letras que foram sublinhadas 
no enunciado deste problema. Preste atenção, pois nenhum espaço foi sublinhado — você é que deve adivinhar o 
número e a localização dos espaços na frase. A única linha da saída deve consistir apenas de letras 
maiúsculas e espaços e ser finalizada por fim de linha.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        int quantidade = in.nextInt();
        System.out.printf("%s\n", frase.substring(0, quantidade));
    }
}