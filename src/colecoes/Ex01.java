/*
1. Leia o nome de uma pessoa e imprima na tela o nome e a quantidade de caracteres do nome.
Exemplo:

Digite seu nome: Lucas
Lucas, 5 caracteres.
 */

package colecoes;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();
        System.out.println("Nome do usuario: " +nome);
        System.out.println(nome + "," + nome.length() + " caractere");
    }
}
