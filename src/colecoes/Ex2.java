/*
Adicione, ao programa do exercício anterior, uma funcionalidade nova para percorrer a lista de números armazenados e,
para cada número, imprimir se ele é par ou ímpar.

Por exemplo, se o usuário informar os números 2, 5 e 7, o programa deve imprimir:

2 é par.
5 é ímpar.
7 é ímpar.
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
    }
}
