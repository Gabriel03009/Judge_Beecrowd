/*
O seu professor de programação gostaria que você fizesse um programa com as seguintes características:

1. Crie duas variáveis reais de dupla precisão;
2. Atribua a primeira o valor 234.345 e a segunda o valor 45.698;
3. Imprima as duas variáveis com seis casas decimais;
4. Imprima as duas variáveis sem nenhuma casa decimal;
5. Imprima as duas variáveis com uma casa decimal;
6. Imprima as duas variáveis com duas casas decimais;
7. Imprima as duas variáveis com três casas decimais;
8. Imprima as duas variáveis com notação cientifica com 'e';
9. Imprima as duas variáveis com notação cientifica com 'E';
10. Imprima as duas variáveis com a representação mais curta, com 'e' ou 'E' ou sem;
11. Imprima as duas variáveis com a representação mais curta, com 'e' ou 'E' ou sem;

Para imprimir, separe os valores com um espaço em branco, um traço (-) e um espaço em branco.

Entrada
Não há.

Saída
O resultado de seu programa deve ser escrito conforme o exemplo da saída.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.text.*;

class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat(".00");

        double a = 234.345;
        double b = 45.698;

        System.out.printf("%.6f - %.6f\n", a, b);
        System.out.printf("%.0f - %.0f\n", a, b);
        System.out.printf("%.1f - %.1f\n", a, b);
        System.out.printf("%s - %s\n", df.format(BigDecimal.valueOf(a)), df.format(BigDecimal.valueOf(b)));
        System.out.printf("%.3f - %.3f\n", a, b);
        System.out.printf("%e - %e\n", a, b);
        System.out.printf("%E - %E\n", a, b);
        System.out.printf("%.3f - %.3f\n", a, b);
        System.out.printf("%.3f - %.3f\n", a, b);
    }
}