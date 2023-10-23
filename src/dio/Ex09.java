/*
9 - Faça um programa que calcule o IMC (Índice de Massa Corporal) de uma pessoa.
Para isso, leia o peso e a altura da pessoa, e em seguida imprima o seu IMC, que é calculado como:
IMC = peso / (altura)²

Por exemplo, se a altura for 1.80 e o peso for 85.2, imprima:
"Seu IMC é 26.29."
 */

package dio;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a sua Altura: ");
        double alturaDaPessoa = teclado.nextDouble();

        System.out.print("Digite seu Peso: ");
        double pesoDaPessoa = teclado.nextDouble();

        double divisao = pesoDaPessoa / (alturaDaPessoa * alturaDaPessoa);
        System.out.println("O seu IMC é: " + divisao);
    }
}
