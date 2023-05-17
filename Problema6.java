
/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 6. Faça um programa para imprimir o conceito de um aluno. O
conceito é calculado em função da nota do aluno que varia de 0
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo
* Data de entrega: 21/5/2023
*/

import java.util.Scanner;
class Problema6{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual foi sua nota? ");
        double nota = teclado.nextDouble();

        if (nota > 0 && nota <= 49) {
            System.out.println("Conceito: insuficiente.");
        } else if (nota > 49 && nota <= 64) {
            System.out.println("Conceito: regular.");
        } else if (nota > 64 && nota <= 84) {
            System.out.println("Conceito: bom.");
        } else if (nota > 84 && nota <= 100) {
            System.out.println("Conceito: ótimo.");
        }
        teclado.close();
    }
}