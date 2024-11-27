/*
Ana e suas amigas estão fazendo um trabalho de geometria para o colégio, em que precisam formar vários 
triângulos, numa cartolina, com algumas varetas de comprimentos diferentes. Logo elas perceberam que não 
dá para formar triângulos com três varetas de comprimentos quaisquer: se uma das varetas for muito grande 
em relação às outras duas, não dá para formar o triângulo.

Neste problema, você precisa ajudar Ana e suas amigas a determinar se, dados os comprimentos de quatro 
varetas, é ou não é possível selecionar três varetas, dentre as quatro, e formar um triângulo.

Entrada
A entrada é composta por apenas uma linha contendo quatro números inteiros A, B, C e D (1 ≤ A, B, C, D ≤ 100).

Saída
Seu programa deve produzir apenas uma linha contendo apenas um caractere, que deve ser ‘S’ caso seja possível 
formar o triângulo, ou ‘N’ caso não seja possível formar o triângulo.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Triangulo{
    public Triangulo(){
    }
    
    public int verificar(int A, int B, int C){
        if(A + B > C && B + C > A && A + C > B){
            return 1;
        }else{
            return 0;
        }
    }  
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Triangulo tri = new Triangulo();
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int verificar = 0;

        verificar += tri.verificar(a, b, c);
        verificar += tri.verificar(b, c, d);
        verificar += tri.verificar(c, d, a);
        verificar += tri.verificar(d, a, b);

        if(verificar > 0){
            System.out.printf("S\n");
        }else{
            System.out.printf("N\n");
        }
    }
}