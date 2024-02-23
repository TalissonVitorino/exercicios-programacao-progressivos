package Lista1;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = teclado.nextInt();
        System.out.println("Digite um número: ");
        int numero2 = teclado.nextInt();
        System.out.println("Digite um número: ");
        int numero3 = teclado.nextInt();
        System.out.println("Digite um número: ");
        int numero4 = teclado.nextInt();
        int soma = 0;

        if (numero1 % 2 == 0) soma = soma + numero1;
        if (numero2 % 2 == 0) soma = soma + numero2;
        if (numero3 % 2 == 0) soma = soma + numero3;
        if (numero4 % 2 == 0) soma = soma + numero4;
        System.out.println("O total da soma é: " + soma);
    }
}
