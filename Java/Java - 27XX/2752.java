/*
O seu professor de programação gostaria que você fizesse um programa com as seguintes características:

1. Crie uma variável para armazenar 50 caracteres;
2. Atribua a variável anterior a frase: "AMO FAZER EXERCICIO NO URI";
3. Mostre na primeira linha o carácter <, o valor armazenado na variável com o formato "%s" e o carácter >;
4. Mostre na linha seguinte o carácter < , o valor armazenado na variável com o formato "%30s" e o carácter >;
5. Mostre na linha seguinte o carácter < , o valor armazenado na variável com o formato "%.20s" e o carácter >;
6. Mostre na linha seguinte o carácter < , o valor armazenado na variável com o formato "%-20s" e o carácter >;
7. Mostre na linha seguinte o carácter < , o valor armazenado na variável com o formato "%-30s" e o carácter >;
8. Mostre na linha seguinte o carácter < , o valor armazenado na variável com o formato "%.30s" e o carácter >;
9. Mostre na linha seguinte o carácter < , o valor armazenado na variável com o formato "%30.20s" e o carácter >;
10. Mostre na linha seguinte o carácter < , o valor armazenado na variável com o formato "%-30.20s" e o carácter >;

Entrada
Não há.

Saída
O resultado de seu programa deve ser escrito conforme o exemplo da saída.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = "AMO FAZER EXERCICIO NO URI";
        System.out.printf("<%s>\n", a);
        System.out.printf("<%30s>\n", a);
        System.out.printf("<%.20s>\n", a);
        System.out.printf("<%-20s>\n", a);
        System.out.printf("<%-30s>\n", a);
        System.out.printf("<%.30s>\n", a);
        System.out.printf("<%30.20s>\n", a);
        System.out.printf("<%-30.20s>\n", a);
    }
}