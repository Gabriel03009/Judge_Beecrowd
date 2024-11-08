/*
Faça um programa que leia as notas referentes às duas avaliações de um aluno. 
Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas 
(uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

Entrada
A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando 
forem lidas duas notas válidas.

Saída
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. 
O valor deve ser apresentado com duas casas após o ponto decimal.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double nota1, nota2;
        
        do{
            nota1 = in.nextDouble();
            if(nota1 <= 0 || nota1 > 10){
                System.out.printf("nota invalida\n");
            }
        }while(nota1 <= 0 || nota1 > 10);

        do{
            nota2 = in.nextDouble();
            if(nota2 <= 0 || nota2 > 10){
                System.out.printf("nota invalida\n");
            }
        }while(nota2 <= 0 || nota2 > 10);

        System.out.printf("media = %.2f\n", (nota1 + nota2) / 2);
        
    }
}