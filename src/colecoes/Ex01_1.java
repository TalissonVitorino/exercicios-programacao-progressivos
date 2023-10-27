 /*
/*
Alterar o mesmo programa do Exercício 1, para que o usuário possa filtrar os nomes com base em quantidades mínima e máxima de caracteres.

Para isso, adicione ao final do programa a funcionalidade para perguntar ao usuário qual é a quantidade máxima de caracteres dos nomes que ele deseja filtrar.
E, então, imprima na tela, o nome e a quantidade de caracteres de cada nome, mas somente dos nomes que possuírem entre a quantidade mínima e a quantidade máxima de caracteres.

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
Qual é a quantidade máxima de caracteres dos nomes, para filtrar? 7
Fátima, 6 caracteres.
 */

package colecoes;
import java.util.ArrayList;
import java.util.Scanner;

 public class Ex01_1 {
     public static void main(String[] args) {
         Scanner leitura = new Scanner(System.in);
         System.out.print("Digite a quantidade de nomes: ");
         int qtdNomes = Integer.parseInt(leitura.nextLine());
         ArrayList<String> lista = new ArrayList<>();

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
         int qtdMinima =  Integer.parseInt(leitura.nextLine());
         System.out.println("Qual é a quantidade maxíma de caracteres dos nomes, para filtrar?");
         int qtdMaxima =  Integer.parseInt(leitura.nextLine());

         for (String nome : lista) {
             if (nome.length() >= qtdMinima && nome.length() <= qtdMaxima){
                 System.out.println(nome + ", " + nome.length() + " caracteres.");
             }
         }
     }
 }
