/*
A Copa do Mundo de 2010 será realizada na áfrica do Sul. Bolas de futebol são muito fáceis de transportar, 
já que elas saem das fábricas vazias e só são enchidas somente pelas lojas ou pelos consumidores finais.

Infelizmente o mesmo não pode ser dito das bolas de boliche. Como elas são completamente sólidas, elas só 
podem ser transportadas embaladas uma a uma, em caixas separadas.

A SBC - Só Boliche Cascavel - é uma fábrica de bolas de boliche que trabalha somente através de encomendas e 
envia todas as bolas por SEDEX. Como as bolas têm tamanhos diferentes, a SBC tem vários tamanhos de caixas 
diferentes para transportá-las.

Escreva um programa que, dado o diâmetro de uma bola e as 3 dimensões de uma caixa (altura, largura e 
profundidade), diz se a bola de boliche cabe dentro da caixa ou não.

Entrada
A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 10.000) que indica o diâmetro da bola de boliche. 
A segunda linha da entrada contém 3 números inteiros separados por um espaço cada: 
a altura A (1 ≤ A ≤ 10.000), seguida da largura L (1 ≤ L ≤ 10.000) e da profundidade P (1 ≤ P ≤ 10.000).

Saída
Seu programa deve imprimir uma única linha, contendo a letra 'S' caso a bola de boliche 
caiba dentro da caixa ou 'N' caso contrário.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int diametro = in.nextInt();
        int altura = in.nextInt();
        int largura = in.nextInt();
        int profundidade = in.nextInt();

        if(altura >= diametro && largura >= diametro && profundidade >= diametro){
            System.out.printf("S\n");
        }else{
            System.out.printf("N\n");
        }
        
    }
}