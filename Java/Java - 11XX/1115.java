/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando 
pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

Entrada
A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.

Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, 
conforme o exemplo.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y;
        
        do{
            x = in.nextInt();
            y = in.nextInt();
            if(x != 0 && y != 0){
                if(x > 0 && y > 0){
                    System.out.printf("primeiro\n");
                }else if(x < 0 && y > 0){
                    System.out.printf("segundo\n");
                }else if(x < 0 && y < 0){
                    System.out.printf("terceiro\n");
                }else if(x > 0 && y < 0){
                    System.out.printf("quarto\n");
                }
            }
        }while (x != 0 && y != 0);
    }
}