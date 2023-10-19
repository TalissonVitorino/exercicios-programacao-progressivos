/*
3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.
 */

package dio;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor para A: ");
        int a = teclado.nextInt();
        System.out.print("Digite um valor para B: ");
        int b = teclado.nextInt();
        int c;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.println("O resultado é: " + c);
    }
}
