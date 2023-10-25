/*
17. Faça um programa que leia três números e imprima na tela o valor do maior número:

Por exemplo, se o usuário digitar 5, 1 e 9, imprima:

"O maior número é o 9."
 */

package dio;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero ");
        int primeiro = teclado.nextInt();
        System.out.println("Digite o segundo numero ");
        int segundo = teclado.nextInt();
        System.out.println("Digite o terceiro numero ");
        int terceiro = teclado.nextInt();

        if (primeiro > segundo) {
            if (primeiro > terceiro) {
                System.out.println(primeiro);
            } else {
                System.out.println(terceiro);
            }
        } else {
            if (terceiro > segundo) {
                System.out.println(terceiro);
            } else {
                System.out.println(segundo);
            }
        }
    }


}
