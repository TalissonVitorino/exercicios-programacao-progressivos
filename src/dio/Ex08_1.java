/*
8.1 - Faça um algoritmo que leia dois valores inteiros e imprima na tela o valor maior.
 */

package dio;

import java.util.Scanner;

public class Ex08_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número:");
        int numero = teclado.nextInt();

        System.out.print("Digite um número:");
        int outroNumero = teclado.nextInt();

        if (numero > outroNumero){
            System.out.println(numero);
        }else{
            System.out.println(outroNumero);
        }
    }
}
