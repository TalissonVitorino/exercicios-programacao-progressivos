package Lista1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero para A ");
        int a = leitura.nextInt();
        System.out.println("Digite outo numero para B ");
        int b = leitura.nextInt();

        if (a > b) {
            System.out.println("A é maior ");
        } else {
            if (a < b) {
                System.out.println("B é maior");
            } else {
                System.out.println("\"A=B\"");
            }
        }
    }
}
