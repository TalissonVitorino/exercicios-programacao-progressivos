/*
- Faça um programa que lerá dois valores A e B, e guardará esses valores duas variáveis "a" e "b", respectivamente. Imprima A e B, nesta ordem.

Em seguida, troque os valores entre si, de forma que a variável "b" fique com o valor A, e que a variável "a" fique com o valor B.
Imprima novamente A e B, nesta ordem. Note que, nesta segunda impressão, os valores deverão estar trocados.
 */
package dio;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        String a = teclado.nextLine();
        System.out.print("Digite outro valor: ");
        String b = teclado.nextLine();
        System.out.println(a);
        System.out.println(b);

        String aux = a;
        a = b;
        b = aux;

        System.out.println("Trocando...");
        System.out.println(a);
        System.out.println(b);
    }
}
