/*
21.2. Faça uma calculadora de soma de números ímpares. Para isso,
leia números digitados pelo usuário e depois mostre a soma de todos os números ímpares digitados.

Enquanto o usuário estiver digitando números maiores do que zero,
vá somando os números. Mas quando o usuário digitar 0,interrompa a leitura e imprima na
tela o valor da soma de todos os números ímpares.

Exemplo:
Digite um número: 1
Digite um número: 2
Digite um número: 3
Digite um número: 4
Digite um número: 5
Digite um número: 0

A soma dos ímpares é: 9
 */
package dio;

import java.util.Scanner;

public class Ex21_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int somado = 0;
        int numero = 0;

        do {
            if (numero % 2 == 1){
                somado = numero + somado;
            }
            System.out.print("Digite o valor a ser somado: ");
            numero = teclado.nextInt();
        } while (numero > 0);
        System.out.println("O valor da soma de todos os números ímpares digitados = " + somado + ".");
    }
}
