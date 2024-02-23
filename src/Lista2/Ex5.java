package Lista2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite quantos alunos são: ");
        int quantidade = teclado.nextInt();
        int somaIdades = 0;

        for (int i = quantidade; i >= 1 ; i = i - 1) {
            System.out.print("Digite a idade do aluno " + (i) + ": ");
            int idades = teclado.nextInt();
            somaIdades += idades;
        }
        double media = (double) somaIdades / quantidade;
        System.out.println("A média é: " + media);
    }
}
