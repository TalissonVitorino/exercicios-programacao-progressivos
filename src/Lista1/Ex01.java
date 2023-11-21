package Lista1;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numeroSucessor = teclado.nextInt() + 1;
        System.out.println("Numero com o sucessor é: " + numeroSucessor);
    }
}

