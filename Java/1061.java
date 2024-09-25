/*
Pedrinho está organizando um evento em sua Universidade. 
O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. 
O problema é que Pedrinho quer calcular o tempo que o evento vai durar, 
uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, 
você deverá ajudar Pedrinho a calcular a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”, 
seguido de um espaço e o dia do mês no qual o evento vai começar. 
Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. 
Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, 
indicando o término do evento.

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String entrada[] = new String[4];
        for (int i = 0; i < entrada.length; i++){
            entrada[i] = in.nextLine();
        }

        String[] dInicio = entrada[0].split(" ");
        String[] hInicio = entrada[1].split(" : ");
        String[] dFim = entrada[2].split(" ");
        String[] hFim = entrada[3].split(" : ");

        int dataInicio = Integer.parseInt(dInicio[1]);
        int horaInicio = Integer.parseInt(hInicio[0]);
        int minutoInicio = Integer.parseInt(hInicio[1]);
        int segundoInicio = Integer.parseInt(hInicio[2]);

        int dataFim = Integer.parseInt(dFim[1]);
        int horaFim = Integer.parseInt(hFim[0]);
        int minutoFim = Integer.parseInt(hFim[1]);
        int segundoFim = Integer.parseInt(hFim[2]);

        int segundosTotais = (dataFim - dataInicio) * 86400 + (horaFim - horaInicio) * 3600 + 
        (minutoFim - minutoInicio) * 60 + (segundoFim - segundoInicio);

        int dia = segundosTotais / 86400;
        int hora = (segundosTotais % 86400) / 3600;
        int minuto = ((segundosTotais % 86400) % 3600) / 60;
        int segundo = ((segundosTotais % 86400) % 3600) % 60;

        System.out.printf("%d dia(s)\n", dia);
        System.out.printf("%d hora(s)\n", hora);
        System.out.printf("%d minuto(s)\n", minuto);
        System.out.printf("%d segundo(s)\n", segundo);
    }
}