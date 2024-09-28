/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
Escreva um algoritmo para ler o tipo de combustível abastecido 
(codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) 
deve ser solicitado um novo código (até que seja válido). 
O programa será encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram 
cada tipo de combustível.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int entrada, alcool, gasolina, diesel;
        alcool = 0; 
        gasolina = 0;
        diesel = 0;

        do{
            entrada = in.nextInt();
            
            if(entrada == 1){
                alcool++;
            }else if (entrada == 2){
                gasolina++;
            }else if (entrada == 3){
                diesel++;
            }      
        }while (entrada != 4);

        System.out.printf("MUITO OBRIGADO\n");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
    }
}