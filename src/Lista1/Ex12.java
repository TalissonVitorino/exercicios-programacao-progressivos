package Lista1;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual era a velocidade do motorista? ");

        double velocidadeMotoriusta = teclado.nextDouble();
        System.out.print("Qual era a velocidade maxima da pista? ");

        double velocidadePista = teclado.nextDouble();
        double excessoVelocidade = velocidadeMotoriusta - velocidadePista;

        if (excessoVelocidade <= 0) {
            System.out.println("Não tem multa! ");
        } else {
            if (excessoVelocidade > 0 && excessoVelocidade <= 10) {
                System.out.println("A multa será 50.");
            } else {
                if (excessoVelocidade > 10 && excessoVelocidade <= 30) {
                    System.out.println("A multa será 100.");
                } else {
                    System.out.println("A multa será 200.");
                }
            }
        }
    }
}
