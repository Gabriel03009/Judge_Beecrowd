/*
O seu professor de programação gostaria que você fizesse um programa com as seguintes características:

1. Criar 16 variáveis inteiras;
2. Atribuir a elas valores de 0 a 15 a cada um das variáveis anteriores;
3. Ter 39 traços (-) na primeira linha;
4. Ter uma | embaixo do primeiro traço, décimo terceiro, vigésimo terceiro e do trigésimo nono traço da primeira linha, embaixo do 4o traço deve começar a escrever “decimal”, embaixo do 16o traço deve começar a escrever “octal”, embaixo do 26o traço deve começar a escrever “Hexadecimal” e o restante preencher com espaço em branco;
5. Repita o procedimento 3;
6. Ter uma | embaixo do primeiro traço, décimo terceiro, vigésimo terceiro e do trigésimo nono traço da primeira linha, embaixo do 8o traço deve imprimir o valor da primeira variável em valor decimal, embaixo do 18o traço deve imprimir o valor da primeira variável em valor octal, embaixo do 31o traço deve imprimir o valor da primeira variável em valor hexadecimal e o restante preencher com espaço em branco;
7. Repita o procedimento 6 para as outras 15 variáveis;
8. Repita o procedimento 3.
No final deve ficar igual a imagem a seguir:

--------------------------------------- (39 traços)
|  decimal  |  octal  |  Hexadecimal  |
---------------------------------------
|      0    |    0    |       0       |
|      1    |    1    |       1       |
|      2    |    2    |       2       |
|      3    |    3    |       3       |
|      4    |    4    |       4       |
|      5    |    5    |       5       |
|      6    |    6    |       6       |
|      7    |    7    |       7       |
|      8    |   10    |       8       |
|      9    |   11    |       9       |
|     10    |   12    |       A       |
|     11    |   13    |       B       |
|     12    |   14    |       C       |
|     13    |   15    |       D       |
|     14    |   16    |       E       |
|     15    |   17    |       F       |
--------------------------------------- (39 traços)
Entrada
Não há.

Saída
A saída será impressa conforme a figura acima.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {

        String linha = "---------------------------------------\n";
        System.out.printf("%s|  decimal  |  octal  |  Hexadecimal  |\n%s", linha, linha);

        for(int i = 0; i < 16; i++){
            System.out.printf("|%7s    |%5s    |%8s       |\n", Integer.toString(i), Integer.toOctalString(i), Integer.toHexString(i).toUpperCase());
        }
        System.out.printf(linha);
    }
}
