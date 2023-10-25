/*
16.2. Faça um programa que leia um número inteiro digitado pelo usuário e informe na tela se o número é negativo (menor do que zero) ou se é positivo (maior ou igual a zero).


Em seguida, imprima na tela o valor absoluto do número (ou seja, o próprio número, mas sempre positivo).

Exemplos:
- Se o usuário informou o número 5, imprima: "O valor absoluto do número 5 é 5."
- Se o usuário informou o número 0, imprima: "O valor absoluto do número 0 é 0."
- Se o usuário informou o número -3, imprima: "O valor absoluto do número -3 é 3."
- Se o usuário informou o número -1, imprima: "O valor absoluto do número -1 é 1."



Em seguida, imprima o valor simétrico do número. O valor simétrico do número é o número com o sinal trocado.

Exemplos:
- Se o usuário informou o número 5, imprima: "O valor simétrico do número 5 é -5."
- Se o usuário informou o número 0, imprima: "O valor simétrico do número 0 é 0."
- Se o usuário informou o número -3, imprima: "O valor simétrico do número -3 é 3."
- Se o usuário informou o número -1, imprima: "O valor simétrico do número -1 é 1."
- Se o usuário informou o número 2, imprima: "O valor simétrico do número 2 é -2."
 */

package dio;

import java.util.Scanner;

public class Exe16_2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        int numeroAbsoluto;

        if (numero < 0) {
            numeroAbsoluto = -numero;
            System.out.println("Número negativo");
        } else {
            numeroAbsoluto = numero;
            System.out.println("Número positivo");
        }
        System.out.println("O valor absoluto número " + numero + " é " + numeroAbsoluto + ".");
        System.out.println("O valor simétrico do número " + numero + " é " + -numero + ".");

    }
}
