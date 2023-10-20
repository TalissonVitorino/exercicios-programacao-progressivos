/*
11 - Faça um algoritmo que leia o nome do aluno e as quatro notas obtidas por ele. Calcule a média das nota obtidas e imprima na tela a frase no seguinte formato:
"[nome], a sua média é [média]."

Exemplo:
"Lucas, a sua média é 7.5."
 */

package dio;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = teclado.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = teclado.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double terceiraNota = teclado.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double quartaNota = teclado.nextDouble();

        double somaDasNotas = primeiraNota + segundaNota + terceiraNota + quartaNota;
        double mediasDasnotas = somaDasNotas / 4;
        System.out.println(nome + ", sua media é: " + mediasDasnotas);
    }
}
