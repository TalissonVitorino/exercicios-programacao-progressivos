/*
20. Faça um programa que leia um valor entre 0 e 10 e imprima o valor na tela.

O valor precisa ser necessariamente entre 0 e 10, então se for informado um valor inválido, deve ser lido um novo valor até que seja lido um valor válido.
 */
package dio;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um numero de 0 a 10 ");
            numero = teclado.nextInt();
        }while (numero < 0 || numero > 10);
        System.out.println(numero);
    }
}
