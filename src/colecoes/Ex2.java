/*
Adicione, ao programa do exercício anterior, uma nova funcionalidade (mantendo todas as funcionalidades anteriores)
para armazenar os números da lista em duas outras listas: uma que conterá somente números pares e outra que conterá somente números impares.

Por exemplo, se o usuário informar os números 2, 5, 7, 8 e 9, além de fazer tudo o que o programa já fazia antes,
o programa deverá encerrar com os números separados em duas listas diferentes, e imprimir as listas. Ex:

[2,8]
[5,7,9]
 */

package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número :");
        int numero = Integer.parseInt(leitura.nextLine());

        while (numero != 0) {
            lista.add(numero);
            System.out.print("Digite um número :");
            numero = Integer.parseInt(leitura.nextLine());
        }

        int numerosSomados = 0;
        for (Integer num : lista) {
            numerosSomados = numerosSomados + num;
        }
        System.out.println("total de números somados é " + numerosSomados + ".");
        double media = (double) numerosSomados / lista.size();
        System.out.println("A média dos números é " + media + ".");

        for (Integer num : lista) {
            if (num % 2 == 0) {
                System.out.println("Número par! " + num);
            } else {
                System.out.println("Número ímpar! " + num);
            }
        }
        ArrayList<Integer> listaImpares = new ArrayList<>();
        ArrayList<Integer> listaPares = new ArrayList<>();
        for (Integer num : lista) {
            if (num % 2 == 0) {
                listaPares.add(num);
            } else {
                listaImpares.add(num);
            }
        }
        System.out.println("Lista de números pares: " + listaPares);
        System.out.println("Lista de números impares: " + listaImpares);
    }
}
