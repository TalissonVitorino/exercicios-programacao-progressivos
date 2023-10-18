import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = leitura.nextLine();
        System.out.println("Digite sua idade: ");
        idade = leitura.nextInt();
        System.out.println("Bem vindo(a): ");

        if (idade < 18) {
            System.out.println("Seja bem-vindo(a), " + nome + ". Temos um novo vídeo da Galinha Pintadinha para você!");

        } else {
            System.out.println("Seja bem-vindo(a), " + nome + ". Temos novidades na seção de vídeos adultos!");
        }
    }
}