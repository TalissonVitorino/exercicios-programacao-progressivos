/*
pedir as medias dos alunos
calcular as medias

 */

package Lista1;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite nota do aluno");
        double primeiraNota = teclado.nextDouble();
        System.out.println("Digite média do aluno");
        double segundaNota = teclado.nextDouble();
        System.out.println("Digite média do aluno");
        double terceiraNota = teclado.nextDouble();

        double somaDasNotas = primeiraNota + segundaNota + terceiraNota;
        double mediasDasnotas = somaDasNotas / 3;
        if (mediasDasnotas >= 7) {
            System.out.println("Aprovado");
        } else {
            if (mediasDasnotas >= 5) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
