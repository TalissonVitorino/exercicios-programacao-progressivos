package Lista1;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quanto de latão que você precisa? ");
        double latao = teclado.nextDouble();
        double cobre = latao * 70 / 100;
        double zinco = latao * 30 / 100;

        System.out.println("Quantidade de cobre é: " + cobre);
        System.out.println("Quantidade de zinco é: " + zinco);
    }
}
