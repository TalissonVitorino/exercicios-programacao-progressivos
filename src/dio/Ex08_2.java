/*
8.2 - Faça um algoritmo que leia dois valores inteiros e imprima na tela o valor menor. Em seguida, calcule o seu antecessor e o seu sucessor e imprima-os na tela.

Ex.: Se forem informados os valores 5 e 8, imprimir:

O menor valor é: 5
Antecessor: 4
Antecessor:6
 */


package dio;

import java.util.Scanner;

public class Ex08_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: = ");
        int a = teclado.nextInt();

        System.out.print("Digite o segundo numero: = ");
        int b = teclado.nextInt();

        int menorValor;
        if (a < b){
            menorValor = a;
        }
        else{
            menorValor = b;

        }
        System.out.println("O menor valor é: " + menorValor);

        int antecessor = menorValor - 1;
        System.out.println("Antecessor: " + antecessor);

        int sucessor = menorValor + 1;
        System.out.println("Sucessor: " + sucessor);
    }
}
