package dio;

import java.util.Scanner;

public class Exe18 {
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

        if (primeiro > segundo) {
            if (primeiro > terceiro) {
                if (primeiro > quarto) {
                    System.out.print("O maior número é " + primeiro + ".");
                } else {
                    System.out.print("O maior número é " + quarto + ".");
                }
            } else {
                if (terceiro > quarto) {
                    System.out.print("O maior número é " + terceiro + ".");
                } else {
                    System.out.print("O maior número é " + quarto + ".");
                }
            }
        } else {
            if (segundo > terceiro) {
                if (segundo > quarto) {
                    System.out.print("O maior número é " + segundo + ".");
                } else {
                    System.out.print("O maior número é " + quarto + ".");
                }
            } else {
                if (terceiro > quarto) {
                    System.out.print("O maior número é " + terceiro + ".");
                } else {
                    System.out.print("O maior número é " + quarto + ".");

                }

            }
        }

    }

}
