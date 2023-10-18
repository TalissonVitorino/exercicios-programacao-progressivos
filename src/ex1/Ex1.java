package ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String nome;
        int idade;
        int genero;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leitura.nextLine();
        while (nome.length() < 2 || nome.length() > 30){
            System.out.println("numero de caracteres invalido");
            System.out.println("digite entre 2 e 30 caracteres.");
            nome = leitura.nextLine();
        }


        System.out.println("Digite sua idade (0,99): ");
        idade = leitura.nextInt();
        while (idade < 0 || idade > 99) {
            System.out.println("idade invalida");
            System.out.println("Digite sua idade (0 a 99): ");
            idade = leitura.nextInt();

        }


        System.out.println("selecione a opção de gênero desejada: ");
        System.out.println("1 Para masculino, 2 para feminino ");
        genero = leitura.nextInt();

        System.out.println("****************************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("idade do cliente: " + idade);
        System.out.println("Genero do cliete: " + genero);
        System.out.println("****************************************");

        if (idade < 18) {
            if (genero == 1) {
                System.out.println("Seja bem-vindo, " + nome + ". Temos um novo vídeo da Galinha Pintadinha para você!");
            } else {
                System.out.println("Seja bem-vinda, " + nome + ". Temos um novo vídeo da Galinha Pintadinha para você!");
            }
        } else {
            if (genero == 1) {
                System.out.println("Seja bem-vindo, " + nome + ". Temos novidades na seção de vídeos adultos!");
            } else {
                System.out.println("Seja bem-vinda, " + nome + ". Temos novidades na seção de vídeos adultos!");
            }
        }
    }
}
