/*
15.1 - Faça um programa que leia um número inteiro digitado pelo usuário e informe na tela se o número é ar ou ímpar.

 Em seguida, leia outro um número inteiro digitado pelo usuário e informe na tela se o número é par ou ímpar.

 Em seguida, informe na tela se o produto (multiplicação) desses dois números é par ou ímpar.
 */


package dio;

import java.util.Scanner;

public class Ex15_1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número par!");
        } else {
            System.out.println("Número ímpar!");
        }

        System.out.print("Digite outro número: ");
        int outroNumero = teclado.nextInt();

        if (outroNumero % 2 == 0) {
            System.out.println("Número par!");
        } else {
            System.out.println("Número ímpar!");
        }

        int multiplicaProduto = numero * outroNumero;
        System.out.println(multiplicaProduto);

        if (multiplicaProduto % 2 == 0) {
            System.out.println("Número par!");
        } else {
            System.out.println("Número ímpar!");
        }

    }


}
