package Lista2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite quantos alunos são: ");
        int quantidade = teclado.nextInt();
        int somaIdades = 0;

        for (int i = 0; i < quantidade; i = i + 1) {
            System.out.print("Digite a idade do aluno " + (i+1) + ": ");
            int idades = teclado.nextInt();
            somaIdades += idades;
        }
        int media = somaIdades / quantidade;
        System.out.println(media);
    }
}
