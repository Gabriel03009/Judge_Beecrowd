/*
Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor, 
deve ser apresentado como resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.

Entrada
A entrada contém um único valor inteiro.

Saída
Imprima por extenso o nome do mês correspondente ao número existente na entrada, 
com a primeira letra em maiúscula.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numero;
        String[] mes = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };

        numero = in.nextInt() - 1;

        System.out.printf("%s\n", mes[numero]);
        
    }
}