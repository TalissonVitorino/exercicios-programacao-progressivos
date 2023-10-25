/*
18.1. Faça um programa que leia quatro números e imprima na tela o valor do maior número e o valor do menor número:

Por exemplo, se o usuário digitar 5, 1, 9 e 4, imprima:

"O maior número é o 9 e o menor número é o 1."
 */

package dio;

import java.util.Scanner;

public class Exe18_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiro = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundo = teclado.nextInt();
        System.out.print("Digite o terceiro número: ");
        int terceiro = teclado.nextInt();
        System.out.print("Digite o quarto número: ");
        int quarto = teclado.nextInt();
        int maiorValor;
        int menorValor;

        if (primeiro > segundo) {
            if (primeiro > terceiro) {
                if (primeiro > quarto) {
                    maiorValor = primeiro;
                } else {
                    maiorValor = quarto;
                }
            } else {
                if (terceiro > quarto) {
                    maiorValor = terceiro;
                } else {
                    maiorValor = quarto;
                }
            }
        } else {
            if (segundo > terceiro) {
                if (segundo > quarto) {
                    maiorValor = segundo;
                } else {
                    maiorValor = quarto;
                }
            } else {
                if (terceiro > quarto) {
                    maiorValor = terceiro;
                } else {
                    maiorValor = quarto;
                }
            }
        }

        if (primeiro < segundo) {
            if (primeiro < terceiro) {
                if (primeiro < quarto) {
                    menorValor = primeiro;
                } else {
                    menorValor = quarto;
                }
            } else {
                if (terceiro < quarto) {
                    menorValor = terceiro;
                } else {
                    menorValor = quarto;
                }
            }
        } else {
            if (segundo < terceiro) {
                if (segundo < quarto) {
                    menorValor = segundo;
                } else {
                    menorValor = quarto;
                }
            } else {
                if (terceiro < quarto) {
                    menorValor = terceiro;
                } else {
                    menorValor = quarto;
                }
            }
        }
        System.out.println("O menor valor é " + menorValor + " e o maior valor é " + maiorValor + ".");
    }
}
