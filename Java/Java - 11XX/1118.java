/*
Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno. 
Calcule e imprima a média semestral. O programa só deverá aceitar notas válidas 
(uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao usuário que 
informe um código (1 ou 2) indicando se ele deseja ou não executar o algoritmo novamente, 
(aceitar apenas os código 1 ou 2). Se for informado o código 1 deve ser repetida a execução de 
todo o programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.

Entrada
O arquivo de entrada contém vários valores reais, positivos ou negativos. Quando forem lidas 
duas notas válidas, deve ser lido um valor inteiro X . O programa deve parar quando o valor lido 
para este X for igual a 2.

Saída
Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”. 
Quando duas notas válidas forem lidas, deve ser impressa a mensagem “media = ” seguido do valor do cálculo.

Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e esta 
mensagem deve ser apresentada novamente se o valor da entrada padrão para X for menor do que 
1 ou maior do que 2, conforme o exemplo abaixo.

A média deve ser impressa com dois dígitos após o ponto decimal.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double nota1, nota2;
        int novoCalculo;
        
        do{
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

            do{
                System.out.printf("novo calculo (1-sim 2-nao)\n");
                novoCalculo = in.nextInt();
            }while(novoCalculo < 1 || novoCalculo > 2);
        }while(novoCalculo == 1);
        
    }
}