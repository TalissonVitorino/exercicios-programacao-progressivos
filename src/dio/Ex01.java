/*
1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
 */

package dio;

import java.util.Scanner;

public class Ex01 {
    private static Object leitura;
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor para A: ");
        int a = teclado.nextInt();
        System.out.print("Digite um valor para B: ");
        int b = teclado.nextInt();
        System.out.print("Digite um valor para C: ");
        int c = teclado.nextInt();
        int soma = a + b;
        System.out.println("A soma de A + B é igual a " + soma);

        if (soma >= c){
            System.out.println("Soma é menor que C.");

        }else {
            System.out.println("Soma é maior ou igual a C.");
        }
        //mostras a soma
        // imprimir resultado na tela

    }
    
}
