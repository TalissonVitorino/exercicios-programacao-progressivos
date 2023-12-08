package Lista1;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int x = teclado.nextInt();

        System.out.println("Digite outro numero: ");
        int y = teclado.nextInt();

        var quociente = x / y;
        int restoDivisao = x - quociente * y;
        System.out.println(quociente);
        System.out.println(restoDivisao);
    }
}
