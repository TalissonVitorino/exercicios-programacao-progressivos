package Lista1;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int primeiroNumero = teclado.nextInt();
        System.out.println("Digite outro numero: ");
        int outroNumero = teclado.nextInt();
        int soma;
        int multiplicacao;
        int divisao;

        soma = primeiroNumero + outroNumero;
        System.out.println("Esta é a soma dos valores: " + soma);

        multiplicacao = primeiroNumero * outroNumero;
        System.out.println("Este é o produto: " + multiplicacao);

        divisao = primeiroNumero/ outroNumero;
        System.out.println("Este é o quociente: " + divisao);
    }
}
