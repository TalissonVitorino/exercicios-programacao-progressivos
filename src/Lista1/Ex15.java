package Lista1;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiro = teclado.nextInt();

        System.out.println("Digite o outro número: ");
        int segundo = teclado.nextInt();

        System.out.println("Digite o primeiro número: ");
        int terceiro = teclado.nextInt();

        int maior = primeiro;
        if (primeiro > segundo) {
            if (primeiro > terceiro) {
                maior = primeiro;
            } else {
                if (terceiro > segundo) {
                    maior = terceiro;
                } else {
                    maior = segundo;
                }
            }
        } else {
            if (segundo > terceiro) {
                maior = segundo;
            } else {
                maior = terceiro;
            }
        }
        System.out.println("O Maior número é: " + maior);
    }
}
