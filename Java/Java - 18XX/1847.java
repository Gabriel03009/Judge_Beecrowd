/*
Bem-vindos e bem-vindas à Escola de Inverno da Maratona de Programação 2015 de Erechim! Esperamos 
sinceramente que vocês aprendam muito nestes dias para que tenham muito sucesso nas competições de 
Programação ainda por vir, mas sobretudo esperamos que vocês curtam a Escola, pois quando nos divertimos e 
temos prazer em estudar e programar, o treino deixa de ser um fardo e se torna um hobby. Então, divirtam-se!

O inverno é uma estação maravilhosa, não é mesmo? Todos nós amamos vestir um poncho, participar de uma roda 
de chimarrão, assar pinhões no fogão a lenha… Mas nem todos gostam do inverno, especialmente em lugares onde 
o inverno costuma ser muito cruel. Em Westeros, por exemplo, o humor das pessoas é definido de acordo com as 
tendências climáticas. Com base nas temperaturas dos três últimos dias, as pessoas podem ficar tristes ou 
felizes, ficando mais propensas a fazer guerra ou fazer amor, respectivamente. E, sejamos sinceros, é 
justamente por causa das cenas de amor e de guerra que amamos Game of Thrones!

    1. Se a temperatura desceu do 1º para o 2º dia, mas subiu ou permaneceu constante do 2º para o 3º, as pessoas 
ficam felizes (primeira figura).
    2. Se a temperatura subiu do 1º para o 2º dia, mas desceu ou permaneceu constante do 2º para o 3º, as pessoas 
ficam tristes (segunda figura).
    3. Se a temperatura subiu do 1º para o 2º dia e do 2º para o 3º, mas subiu do 2º para o 3º menos do que 
subira do 1º para o 2º, as pessoas ficam tristes (terceira figura).
    4. Se a temperatura subiu do 1º para o 2º dia e do 2º para o 3º, mas subiu do 2º para o 3º no mínimo o tanto 
que subira do 1º para o 2º, as pessoas ficam felizes (quarta figura).
    5. Se a temperatura desceu do 1º para o 2º dia e do 2º para o 3º, mas desceu do 2º para o 3º menos do que 
descera do 1º para o 2º, as pessoas ficam felizes (quinta figura).
    6. Se a temperatura desceu do 1º para o 2º dia e do 2º para o 3º, mas desceu do 2º para o 3º no mínimo o 
tanto que descera do 1º para o 2º, as pessoas ficam tristes (sexta figura).
    7. Se a temperatura permaneceu constante do 1º para o 2º dia, as pessoas ficam felizes se subiu do 2º 
    para o 3º dia ou tristes caso contrário (respectivamente, sétima e oitava figuras).

https://resources.beecrowd.com/gallery/images/problems/UOJ_1847.jpg

Entrada
A entrada consiste apenas de três inteiros, A, B e C (-100 ≤ A, B, C ≤ 100), os quais representam 
respectivamente as temperaturas registradas no 1º, no 2º e no 3º dias.

Saída
Imprima uma linha contendo uma carinha feliz ou triste, representando como fica o humor do povo de Westeros 
de acordo com as tendências climáticas.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int d1 = in.nextInt();
        int d2 = in.nextInt();
        int d3 = in.nextInt();
        int variacao12 = Math.abs(d1 - d2);
        int variacao23 = Math.abs(d2 - d3);
        
        boolean caso1 = d1 > d2 && d2 <= d3;
        boolean caso4 = d1 < d2 && d2 < d3 && variacao12 <= variacao23;
        boolean caso5 = d1 > d2 && d2 > d3 && variacao12 > variacao23;
        boolean caso7 = d1 == d2 && d2 < d3;
        
        if(caso1 || caso4 || caso5 || caso7){
            System.out.printf(":)\n");
        }else{
            System.out.printf(":(\n");
        }
    }
}