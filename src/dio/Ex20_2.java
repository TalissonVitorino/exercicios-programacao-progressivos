/*
20.2. Faça um programa que leia um número inteiro positivo. Chamaremos esse número de "valor mínimo".

Em seguida, leia outro número inteiro positivo. Chamaremos esse número de "valor máximo".

Em seguida, leia outro número inteiro positivo,
que precisará estar necessariamente entre o valor mínimo e o número máximo.
 Então se for informado um valor inválido, deve ser lido um novo
  valor até que seja lido um valor válido.
 */
package dio;


import java.util.Scanner;

public class Ex20_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor mínimo: ");
        int valorMinimo = teclado.nextInt();
        System.out.print("Digite o numero máximo: ");
        int valorMaximo = teclado.nextInt();

        int entre;
        do {

            System.out.print("Digite um numero: ");
            entre = teclado.nextInt();

        } while (entre < valorMinimo || entre > valorMaximo);
        System.out.print(entre);
    }
}

