/*
Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, 
da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das três 
palavras fornecidas.

Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, 
com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida. 
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String entrada1, entrada2, entrada3;

        entrada1 = in.next();
        entrada2 = in.next();
        entrada3 = in.next();

        if (entrada1.intern() == "vertebrado"){
            if (entrada2.intern() == "ave"){
                if (entrada3.intern() == "carnivoro"){
                    System.out.printf("aguia\n");
                }else{
                    System.out.printf("pomba\n");
                }
            }else{
                if(entrada3.intern() == "onivoro"){
                    System.out.printf("homem\n");
                }else{
                     System.out.printf("vaca\n");
                }  
            }
        }else if (entrada1.intern() == "invertebrado"){
            if (entrada2.intern() == "inseto"){
                if (entrada3.intern() == "hematofago"){
                    System.out.printf("pulga\n");
                }else{
                    System.out.printf("lagarta\n");
                }
            }else{
                if(entrada3.intern() == "hematofago"){
                    System.out.printf("sanguessuga\n");
                }else{
                     System.out.printf("minhoca\n");
                }  
            }
        }
    }
}
