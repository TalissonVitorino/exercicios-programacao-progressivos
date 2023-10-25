/*
17.1 Faça um programa que leia três números e imprima na tela o valor do menor número:

Por exemplo, se o usuário digitar 5, 1 e 9, imprima:

"O maior número é o 1."
 */


package dio;
import java.util.Scanner;
public class Ex17_01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiro = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundo = teclado.nextInt();
        System.out.print("Digite o terceiro número: ");
        int terceiro = teclado.nextInt();

        if (primeiro < segundo) {
            if (primeiro < terceiro) {
                System.out.print("O menor número é " + primeiro + ".");
            } else {
                System.out.print("O menor número é " + terceiro + ".");
            }
        } else {
            if (terceiro < segundo) {
                System.out.print("O menor número é " + terceiro + ".");
            } else {
                System.out.print("O menor número é " + segundo + ".");
            }
        }
    }
}
