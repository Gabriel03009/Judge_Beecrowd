/*
Rosy é uma talentosa professora do Ensino Médio que já ganhou muitos prêmios pela qualidade de sua aula. 
Seu reconhecimento foi tamanho que foi convidada a dar aulas em uma escola da Inglaterra. Mesmo falando bem 
inglês, Rosy ficou um pouco apreensiva com a responsabilidade, mas resolveu aceitar a proposta e encará-la 
como um bom desafio.

Tudo ocorreu bem para Rosy até o dia da prova. Acostumada a dar notas de 0 (zero) a 100 (cem), ela fez o 
mesmo na primeira prova dos alunos da Inglaterra. No entanto, os alunos acharam estranho, pois na Inglaterra 
o sistema de notas é diferente: as notas devem ser dadas como conceitos de A a E. O conceito A é o mais alto, 
enquanto o conceito E é o mais baixo.

Conversando com outros professores, ela recebeu a sugestão de utilizar a seguinte tabela, 
relacionando as notas numéricas com as notas de conceitos:

https://resources.beecrowd.com/gallery/images/contests/UOJ_167_G.png

O problema é que Rosy já deu as notas no sistema numérico, e terá que converter as notas para o sistema de 
letras. Porém, Rosy precisa preparar as próximas aulas (para manter a qualidade que a tornou reconhecida), 
e não tem tempo suficiente para fazer a conversão das notas manualmente.

Você deve escrever um programa que recebe uma nota no sistema numérico e determina o conceito correspondente.

Entrada
A entrada contém um único conjunto de testes, que deve ser lido do dispositivo de entrada padrão 
(normalmente o teclado). A entrada contém uma única linha com um número inteiro N (0 ≤ N ≤ 100), 
representando uma nota de prova no sistema numérico.

Saída
Seu programa deve imprimir, na saída padrão, uma letra (A, B, C, D, ou E em maiúsculas) representando o 
conceito correspondente à nota dada na entrada.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nota = in.nextInt();

        if(nota == 0){
            System.out.printf("E\n");
        }else if(nota >= 1 && nota <= 35){
            System.out.printf("D\n");
        }else if(nota >= 36 && nota <= 60){
            System.out.printf("C\n");
        }else if(nota >= 61 && nota <= 85){
            System.out.printf("B\n");
        }else if(nota >= 86 && nota <= 100){
            System.out.printf("A\n");
        }
    }
}