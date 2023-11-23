package Lista1;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero ");
        int numero1 = teclado.nextInt();
        System.out.println("Digite um numero ");
        int numero2 = teclado.nextInt();
        System.out.println("Digite um numero ");
        int numero3 = teclado.nextInt();
        int soma = numero2 + numero3;

        if (numero1 > soma){
            System.out.println("Numero maior! ");
        }else{
            System.out.println("Numero menor! ");
        }
    }
}
