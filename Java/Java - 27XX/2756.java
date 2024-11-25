/*
O seu professor de programação gostaria que você fizesse um programa com as seguintes características:

1. Coloque sete espaços em branco e coloque o carácter 'A';
2. Coloque seis espaços em branco e coloque o carácter 'B', um espaço em branco e o carácter 'B';
3. Coloque cinco espaços em branco e coloque o carácter 'C', três espaço em branco e o carácter 'C';
4. Coloque quatro espaços em branco e coloque o carácter 'D', cinco espaço em branco e o carácter 'D';
5. Coloque três espaços em branco e coloque o carácter 'E', sete espaço em branco e o carácter 'E';
6. Repita o procedimento 4;
7. Repita o procedimento 3;
8. Repita o procedimento 2;
9. Repita o procedimento 1.

Entrada
Não há.

Saída
O resultado de seu programa deve ser escrito conforme o exemplo de saída.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Letras{
    public Letras(){
    }
    
    public void a (){
        System.out.printf("       A\n");
    }
    public void b (){
        System.out.printf("      B B\n");
    }
    public void c (){
        System.out.printf("     C   C\n");
    }
    public void d (){
        System.out.printf("    D     D\n");
    }
    public void e (){
        System.out.printf("   E       E\n");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Letras letras = new Letras();

        letras.a();
        letras.b();
        letras.c();
        letras.d();
        letras.e();
        letras.d();
        letras.c();
        letras.b();
        letras.a();
        
    }
}