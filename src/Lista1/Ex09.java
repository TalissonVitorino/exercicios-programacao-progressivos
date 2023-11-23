package Lista1;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um nome ");
        String nome = leitura.nextLine();
        String nome1 = leitura.nextLine();

        if (nome.equals(nome1)){
            System.out.println("NOME CORRETO");

        }else {
            System.out.println("NOME INCORRETO");
        }

    }
}
