package Lista1;

import java.util.Scanner;

import static java.lang.Math.*;
public class Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o raio da base do cilindro");
        double raio = teclado.nextDouble();
        System.out.println("Digite a altura do cilindro");
        double altura = teclado.nextDouble();

        double volume = PI * raio * raio * altura;
        System.out.println("Vlaor do volume é: " + volume);

        double area = 2 * PI * raio * raio + 2 * PI * raio * altura;
        System.out.println("O valor da area é: "+ area);
    }
}
