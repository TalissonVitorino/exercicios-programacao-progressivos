package alura;

import java.util.Scanner;

public class DesafioTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma temperatura em celsius: ");
        double temperaturaEmCelsius = teclado.nextDouble();
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        System.out.println("A temperatura de " + temperaturaEmCelsius + " Celsius é equivalente a " + temperaturaEmFahrenheit + " Fahrenheit." );

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);





    }
}
/*
pedir o valor me Celsius para o usuario
fazer a conversão para Fahrenheit
imprimir o resultado na tela dos valores convertidos
 */