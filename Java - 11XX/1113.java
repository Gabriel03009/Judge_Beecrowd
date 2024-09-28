/*
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. 
Escreva para cada X e Y uma mensagem que indique se estes valores 
foram digitados em ordem crescente ou decrescente.

Entrada
A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. 
A leitura deve ser encerrada ao ser fornecido valores iguais para X e Y.

Saída
Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente, 
caso contrário imprima a mensagem “Decrescente”.
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
            
            if(x > y){
                System.out.printf("Decrescente\n");
            }else if (y > x){
                System.out.printf("Crescente\n");
            }       
        }while (x != y);
    }
}