package Lista1;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Há quantos anos que você fuma? ");
        double numeroAnos = teclado.nextDouble();
        System.out.println("Quantos cigarros por dia você costuma fumar? ");
        double cigarrosPorDia = teclado.nextDouble();
        System.out.println("Qual é o valor da carteira de cigarro? ");
        double valorCarteira = teclado.nextDouble();
        double somaDosGastos = numeroAnos * 365 * cigarrosPorDia / 20 * valorCarteira;
        System.out.println("total dos gastos é " + somaDosGastos);
    }
}
