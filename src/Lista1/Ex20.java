/*

 */

package Lista1;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano para ser verificado: ");
        double ano = teclado.nextDouble();

        if (ano % 400 == 0) {
            System.out.println("Ano bissexto. ");
        } else {
            if (ano % 4 == 0) {
                if (ano % 100 != 0) {
                    System.out.println("Ano bissexto. ");
                } else {
                    System.out.println("Ano nao bissexto. ");
                }
            } else {
                System.out.println("nao e bissexto. ");
            }
        }

    }
}
/* jeito 2
   if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("Bissexto.");
        } else {
            System.out.println("Não Bissexto.");
        }
 */