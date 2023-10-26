/*

22. Faça um programa que leia o nome completo do usuário. O nome completo deve ter pelo menos 8 caracteres e,
enquanto o usuário não informar um nome completo válido, um novo nome deve ser lido.

Em seguida, imprima uma mensagem de boas-vindas. Ex.:

"Receba nossas boas-vindas, João!"
 */

package dio;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();

        while (nome.length() < 8){
            System.out.println("Número de caracteres inválido");
            System.out.println("Digite entre 2 e 10 caracteres.");
            nome = leitura.nextLine();
        }
        System.out.println("Receba nossas boas-vindas, " + nome +"!");
    }
}
