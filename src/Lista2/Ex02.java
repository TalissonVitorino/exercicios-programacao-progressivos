package Lista2;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Imprimir os múltiplos de ");
        int multiplicacao = teclado.nextInt();

        System.out.print("menores ou iguais a ");
        int limitador = teclado.nextInt();

        for (int cont = multiplicacao; cont <= limitador; cont = cont + multiplicacao) {
            System.out.println("" + cont);
        }
    }
}
