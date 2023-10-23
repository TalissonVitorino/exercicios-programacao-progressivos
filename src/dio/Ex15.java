/*
  15 - Faça um programa que leia um número inteiro digitado pelo usuário e informe na tela se o número é par ou ímpar.
 */
package dio;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número par!");
        } else {
            System.out.println("Número ímpar!");
        }
    }
}
