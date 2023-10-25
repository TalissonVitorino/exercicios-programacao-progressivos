/*
20.1. Faça um programa que leia um número inteiro positivo. Chamaremos esse número de "valor máximo".

Em seguida, leia outro número inteiro positivo, que precisará estar necessariamente entre 0 e o número máximo.
Então se for informado um valor inválido, deve ser lido um novo valor até que seja lido um valor válido. */
package dio;


import java.util.Enumeration;
import java.util.Scanner;

public class Ex20_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorMaximo;
        System.out.print("Digite um numero positivo: ");
        valorMaximo = teclado.nextInt();
        int entre;

        do {

            System.out.print("Digite um numero de 0 : ");
            entre = teclado.nextInt();

        } while (entre < 0 || entre > valorMaximo);
        System.out.println(entre);
    }
}

