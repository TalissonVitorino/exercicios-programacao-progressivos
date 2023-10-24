package dio;
/*
16. Faça um programa que leia um número inteiro digitado pelo usuário e informe na tela se o número é negativo (menor do que zero) ou se é positivo (maior ou igual a zero).
 */

import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número positivo");
        }
    }
}
