/*
ler numeros naturais ate 100
somar eles
imprimir o resultado na tela
 */
package Lista2;

import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero de 1 á 100: ");
        int numero = teclado.nextInt();

        int soma = 0;
        int contador = 0;
        while (contador <= numero) {
            soma = soma + contador;
            contador++;
        }
        System.out.println("A soma dos números inteiros é: " + soma);

        soma = 0;
        for (int cont = 0; cont <= numero; cont++) {
            soma = soma + cont;
        }
        System.out.println("A soma dos números inteiros é: " +soma);
    }
}

