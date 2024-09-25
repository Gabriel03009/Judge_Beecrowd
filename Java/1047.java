/*
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. 
A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” . 
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal, horaMinutoInicial, horaMinutoFinal, 
        horaMinutoTotal, hora = 0, minuto = 0;

        horaInicial = in.nextInt() * 60;
        minutoInicial = in.nextInt();
        horaFinal = in.nextInt() * 60;
        minutoFinal = in.nextInt();

        horaMinutoInicial = horaInicial + minutoInicial;
        horaMinutoFinal = horaFinal + minutoFinal;

        if (horaMinutoInicial == horaMinutoFinal){
            System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
        }else{
            if (horaMinutoInicial < horaMinutoFinal){
                horaMinutoTotal = horaMinutoFinal - horaMinutoInicial;          
                hora = horaMinutoTotal / 60;
                minuto = horaMinutoTotal % 60;
            }
            
            if (horaMinutoInicial > horaMinutoFinal){
                horaMinutoTotal = horaMinutoFinal - horaMinutoInicial + 1440;          
                hora = horaMinutoTotal / 60;
                minuto = horaMinutoTotal % 60;       
            }
            
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hora, minuto);
            
        } 
    }
}