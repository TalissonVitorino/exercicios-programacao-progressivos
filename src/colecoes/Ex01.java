/*
Alterar o programa do Exercício 1 para passar trabalhar com três nomes, em vez de um.

O programa deve ler os nomes de três pessoas e imprimir tela o nome e a quantidade de caracteres de cada nome.

Exemplo:
Digite o nome da pessoa 1: Lucas
Digite o nome da pessoa 2: Talisson
Digite o nome da pessoa 3: José da Silva
Lucas, 5 caracteres.
Talisson, 8 caracteres.
José da Silva, 13 caracteres.
 */

package colecoes;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();

        System.out.println("Digite seu nome: ");
        String segundo = leitura.nextLine();

        System.out.println("Digite seu nome: ");
        String terceiro = leitura.nextLine();

        System.out.println("Nome do usuario: " + nome);
        System.out.println("Nome do usuario: " + segundo);
        System.out.println("Nome do usuario: " + terceiro);
        System.out.println();

        System.out.println(nome + "," + nome.length() + " caractere");
        System.out.println(segundo + "," + segundo.length() + " caractere");
        System.out.println(terceiro + "," + terceiro.length() + " caractere");
    }
}
