/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" 
e o algoritmo encerrado. Considere que a senha correta é o valor 2002. 

Entrada
A entrada é composta por vários casos de testes contendo valores inteiros.

Saída
Para cada valor lido mostre a mensagem correspondente à descrição do problema.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int entrada;

        do{
            entrada = in.nextInt();
            
            if(entrada != 2002){
                System.out.printf("Senha Invalida\n");
            }else if (entrada == 2002){
                System.out.printf("Acesso Permitido\n");
            }       
        }while (entrada != 2002);
    }
}