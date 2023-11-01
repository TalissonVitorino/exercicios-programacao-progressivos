/*
Exercício 3:

Faça um programa que leia uma lista de nomes (Strings) informados pelo usuário.
Vá lendo mais nomes enquanto o nome informado não for vazio
(usuário digitar ENTER sem ter digitado nenhum caractere).

Ao final, percorra a lista de nomes e imprima todos
os nomes na tela, convertidos para letras maiúsculas.

Exemplo:
Informe um nome: Lucas<ENTER>
Informe um nome: Talisson<ENTER>
Informe um nome: João<ENTER>
Informe um nome: Pedro<ENTER>
Informe um nome: Paulo<ENTER>
Informe um nome: <ENTER>
LUCAS
TALISSON0
JOÃO
PEDRO
PAULO

Dicas:

- Para verificar se uma variável do tipo Sring é vazia, você pode usar o método "isEmpty()". Por exemplo: if (nome.isEmpty()) { }

- Para converter uma String para que fique toda em letras maiúsculas, você pode usar o método "toUppercase()". Por exemplo: nome.toUppercase()

 */


package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nomesCurtos = new ArrayList<>();
        ArrayList<String> nomeLongos = new ArrayList<>();

        System.out.println("Digite um nome: ");
        String nome = teclado.nextLine();
        while (!nome.isEmpty()) {
            lista.add(nome);
            System.out.print("Digite um nome: ");
            nome = teclado.nextLine();
        }

        for (String nomeAtual : lista) {
            if (nomeAtual.length() < 7) {
                nomesCurtos.add(nomeAtual);
            } else {
                nomeLongos.add(nomeAtual);
            }
            System.out.println("Os nomes convertidos são:");
            System.out.println(nomeAtual.toUpperCase());
        }
        System.out.println("Lista de nomes curtos: " + nomesCurtos);
        System.out.println("Lista de nomes longos: " + nomeLongos);

    }
}


/*

        adicionar duas novas lista para contar caracteres
        percorre a lista for
           verificar se os numeros de caracteres sao maiores ou menores i guais a 7
           se for meno entra na  lista de caracteres menor do que 7 nomesCurtos
           senao entra na lista do lista de caractere maiores que 7 nomesLongos

        por ultimo imprimir na tela as listas


         */