/*
2. Faça um programa que leia números inteiros digitados pelo usuário e vá armazenando em uma lista. Vá lendo os números até que o usuário digite o número 0, o que deve interromper a leitura.

Em seguida, percorra a lista, some todos os números e imprima o resultado da soma na tela.

Dicas:

Para declarar / criar uma lista de números inteiros:
ArrayList<Integer> lista = new ArrayList<>();

Para adicionar números inteiros na lista: igual ao que foi feito na lista de nomes do exercício anterior.

Para percorrer a lista: igual ao que foi feito na lista de nomes do exercício anterior.

Para ler números inteiros do teclado: igual ao que foi feito na lista de nomes do exercício antetior.
 */



package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um numero :");
        int numero = Integer.parseInt(leitura.nextLine());

        while (numero != 0) {
            lista.add(numero);
            System.out.print("Digite um numero :");
            numero = Integer.parseInt(leitura.nextLine());
        }

        int numerosSomados = 0;
        for (Integer num : lista) {
            numerosSomados = numerosSomados + num;
        }
        System.out.println("total de numeros somados é " + numerosSomados + ".");
        double media = (double) numerosSomados / lista.size();
        System.out.print("A média dos números é " + media + ".");
    }
}
