/*
ler dois numeros inteiros
fazer conta
imprimir na tela
 */

package Lista1;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro: ");
        int numero1 = teclado.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numero2 = teclado.nextInt();
        int divisao;

        if (numero2 != 0) {
            divisao = numero1 / numero2;
            System.out.println("O quociente do primeiro numero pelo segundo é: " + divisao);

        } else {
            System.out.println("DIVISÃO POR ZERO!");

        }


    }

}
