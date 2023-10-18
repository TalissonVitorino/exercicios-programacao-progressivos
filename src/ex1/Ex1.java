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
        System.out.println("Digite sua idade: ");
        idade = leitura.nextInt();
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
            }
            else {
                System.out.println("Seja bem-vinda, " + nome + ". Temos um novo vídeo da Galinha Pintadinha para você!");
            }
        }
        else {
            if (genero == 1) {
                System.out.println("Seja bem-vindo, " + nome + ". Temos novidades na seção de vídeos adultos!");
            }
            else {
                System.out.println("Seja bem-vinda, " + nome + ". Temos novidades na seção de vídeos adultos!");
            }
        }
    }
}
