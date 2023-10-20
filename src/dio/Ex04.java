/*
4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

 */

package dio;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número:");
        int numero = teclado.nextInt();

        int antecessor = numero - 1;
        System.out.println(antecessor);

        int sucessor = numero + 1;
        System.out.println(sucessor);
    }
}
