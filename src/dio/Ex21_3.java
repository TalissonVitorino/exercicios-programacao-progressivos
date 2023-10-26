/*
21.3. Faça uma calculadora de soma de números pequenos. Para isso, leia números digitados pelo usuário e depois mostre a soma de todos os números menores do que 10.

Enquanto o usuário estiver digitando números maiores do que zero, vá somando os números. Mas quando o usuário digitar 0, interrompa a leitura e imprima na tela o valor da soma de todos os números pequenos.

Exemplo:
Digite um número: 8
Digite um número: 9
Digite um número: 10
Digite um número: 11
Digite um número: 12
Digite um número: 0
A soma dos números pequenos é: 17
 */
package dio;

import java.util.Scanner;

public class Ex21_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int somado = 0;
        int numero = 0;

        do {
            if (numero < 10){
                somado = numero + somado;
            }
            System.out.print("Digite o valor a ser somado: ");
            numero = teclado.nextInt();
        } while (numero > 0);
        System.out.println("A soma dos números pequenos é = " + somado + ".");
    }
}
