/*
9.1  - Faça um programa que calcule o IMC (Índice de Massa Corporal) de uma pessoa.
Para isso, o peso e a altura da pessoa, e em seguida imprima o seu IMC, que é calculado como:
IMC = peso / (altura)²

Por exemplo, se a altura for 1.80 e o peso for 85.2, imprima:
"Seu IMC é 26.29."


Em seguida, imprima na tela a condição corporal da pessoa com base no IMC calculado.

Tabela Condições IMC:
- Abaixo de 18: Abaixo do peso
- A partir de 18, abaixo de 25: Peso ideal
- A partir de 25, abaixo de 30: Levemente acima do peso
- A partir de 30, abaixo de 35: Obesidade grau I
- A partir dd 35, abaixo de 40: Obesidade grau II
- A partir de 40: Obesidade grau III

Exemplo: se o IMC for 26.29, imprima:
"Sua condição corporal: Levemente acima do peso"
 */


package dio;

import java.util.Scanner;

public class Ex09_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a sua Altura: ");
        double alturaDaPessoa = teclado.nextDouble();

        System.out.print("Digite seu Peso: ");
        double pesoDaPessoa = teclado.nextDouble();

        double imc = pesoDaPessoa / (alturaDaPessoa * alturaDaPessoa);
        System.out.println("O seu IMC é: " + imc);

        String condicaoCorporal;

        if (imc < 18) {
            condicaoCorporal = "Abaixo do peso ";
        } else if (imc < 25) {
            condicaoCorporal = "Peso ideal";
        } else if (imc < 30) {
            condicaoCorporal = "Levemente acima do peso";
        } else if (imc < 35) {
            condicaoCorporal = "Obesidade grau I";
        } else if (imc < 40) {
            condicaoCorporal = "Obesidade grau II";
        } else {
            condicaoCorporal = "Obesidade grau III";

        }
        System.out.println("Sua condição corporal: " + condicaoCorporal);
    }
}
