/*
O seu professor de programação gostaria de fazer uma tela com as seguintes características:

1. Ter 39 traços (-) na primeira linha;
2. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, embaixo do 10 traço deve 
começar a escrever a palavra "Roberto" e o restante preencher no meio com espaço em branco;
3. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, preencher no meio com 
espaço em branco;
4. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, embaixo do 10 traço deve 
começar a escrever o número "5786" e o restante preencher no meio com espaço em branco;
5. Repita o procedimento 3;
6. Ter uma | embaixo do primeiro traço e do trigésimo nono traço da primeira linha, embaixo do 10 traço deve 
começar a escrever a palavra "UNIFEI" e o restante preencher no meio com espaço em branco;
7. Repita o procedimento 1.
No final deve ficar igual a imagem a seguir:

--------------------------------------- (39 traços)
|        Roberto                      |
|                                     |
|        5786                         |
|                                     |
|        UNIFEI                       |
--------------------------------------- (39 traços)

Entrada
Não há.

Saída
A saída será impresso conforme a figura acima.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        System.out.printf("---------------------------------------\n");
        System.out.printf("|        Roberto                      |\n");
        System.out.printf("|                                     |\n");
        System.out.printf("|        5786                         |\n");
        System.out.printf("|                                     |\n");
        System.out.printf("|        UNIFEI                       |\n");
        System.out.printf("---------------------------------------\n");
    }
}