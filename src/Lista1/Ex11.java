package Lista1;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        double precoDeCusto = lerPrecoDecusto();
        double imposto = calculaImposto(precoDeCusto);
        double lucroDistribuidor = calculaLucroDistribuidor(precoDeCusto);
        double precoFinal = calculaPrecoFinal(precoDeCusto, imposto, lucroDistribuidor);
        imprimeValores(lucroDistribuidor, imposto, precoFinal);
    }

    private static double lerPrecoDecusto() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o preço de custo do veiculo: ");
        return teclado.nextDouble();
    }

    private static void imprimeValores(double lucroDestribuidor, double imposto, double precoFinal) {
        System.out.println("Lucro do distribuidor é de: " + lucroDestribuidor);
        System.out.println("Imposto é de: " + imposto);
        System.out.println("Preço final: " + precoFinal);
    }

    private static double calculaPrecoFinal(double precoDecusto, double imposto, double lucroDestribuidor) {
        return precoDecusto + imposto + lucroDestribuidor;
    }

    private static double calculaLucroDistribuidor(double precoDecusto) {
        return precoDecusto * 12 / 100;
    }

    private static double calculaImposto(double valor){
        return valor * 45 / 100;
        
    }
}
