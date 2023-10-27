 /*
Alterar o mesmo programa do Exercício 1, para que o usuário possa informar quantos nomes desejar.

Para isso, pergunte ao usuário quantos nomes ele deseja informar.V
Em seguida, leia todos os nomes do teclado.V
Em seguida, imprima na tela o nome e a quantidade de caracteres de cada nome.V

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
 */

package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
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
    }
}
