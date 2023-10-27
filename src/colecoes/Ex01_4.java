/*
Alterar o mesmo programa do Exercício 1, para exibir a quantidade total de caracteres dos nomes excluídos pelo filtro.

Exemplo:

Quantos nomes você deseja informar? 4
Digite o nome da pessoa 1: Lucas
Digite o nome da pessoa 2: Talisson
Digite o nome da pessoa 3: Lia
Digite o nome da pessoa 4: Fátima
Lucas, 5 caracteres.
Talisson, 8 caracteres.
Lia, 3 caracteres.
Fátima, 6 caracteres.

Qual é a quantidade mínima de caracteres dos nomes, para filtrar? 6
Qual é a quantidade máxima de caracteres dos nomes, para filtrar? 8
Talisson, 8 caracteres.
Fátima, 6 caracteres.

Todos os nomes, juntos, possuem 22 caracteres.
Os nomes filtrados, juntos, possuem 14 caracteres.
Os nomes excluídos pelo filtro, juntos, possuem 8 caracteres.
*/

package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01_4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite a quantidade de nomes: ");
        int qtdNomes = Integer.parseInt(leitura.nextLine());
        ArrayList<String> lista = new ArrayList<>();
        int numerosSomados = 0;
        int numerosFiltrados = 0;
        int resto = 0;

        int contador = 1;
        while (contador <= qtdNomes) {
            System.out.print("Digite um nome : ");
            String nome = leitura.nextLine();
            lista.add(nome);
            contador = contador + 1;
        }

        for (String nome : lista) {
            System.out.println(nome + ", " + nome.length() + " caracteres.");
        }

        System.out.println("Qual é a quantidade mínima de caracteres dos nomes, para filtrar?");
        int qtdMinima = Integer.parseInt(leitura.nextLine());
        System.out.println("Qual é a quantidade maxíma de caracteres dos nomes, para filtrar?");
        int qtdMaxima = Integer.parseInt(leitura.nextLine());

        for (String nome : lista) {
            numerosSomados = numerosSomados + nome.length();
            if (nome.length() >= qtdMinima && nome.length() <= qtdMaxima) {
                numerosFiltrados = numerosFiltrados + nome.length();
                System.out.println(nome + ", " + nome.length() + " caracteres.");
            } else {
                resto = resto + nome.length();
            }
        }
        System.out.println("Todos os nomes, juntos, possuem " + numerosSomados + " caracteres.");
        System.out.println("Os nomes filtrados, juntos, possuem " + numerosFiltrados + " caracteres.");
        System.out.println("Os nomes excluídos pelo filtro, juntos, possuem " + resto + " caracteres.");
    }
}
