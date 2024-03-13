import java.util.Scanner;

public class Main6 {
    public static void main(String... strings) {
        Scanner scanner = new Scanner(System.in);

        // Definindo o vetor com 10 elementos
        double[] vetor = new double[10];

        // Lendo os elementos do vetor
        System.out.println("Digite os 10 números:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
        }

        // Calculando a média dos elementos do vetor
        double media = calcularMedia(vetor);

        // Calculando o desvio padrão
        double desvioPadrao = calcularDesvioPadrao(vetor, media);

        // Imprimindo o desvio padrão
        System.out.println("Desvio padrão: " + desvioPadrao);

        scanner.close();
    }

    // Método para calcular a média de um vetor de números
    public static double calcularMedia(double[] vetor) {
        double soma = 0.0;
        for (double num : vetor) {
            soma += num;
        }
        return soma / vetor.length;
    }

    // Método para calcular o desvio padrão de um vetor de números
    public static double calcularDesvioPadrao(double[] vetor, double media) {
        double somaDiferencasQuadrado = 0.0;
        for (double num : vetor) {
            somaDiferencasQuadrado += Math.pow(num - media, 2);
        }
        double variancia = somaDiferencasQuadrado / vetor.length;
        return Math.sqrt(variancia);
    }
}
