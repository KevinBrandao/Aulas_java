import java.util.Scanner;

public class Main5 {
    public static void main(String... strings) {
        Scanner scanner = new Scanner(System.in);

        // Definindo os vetores de números reais com 5 elementos cada
        double[] vetorX = new double[5];
        double[] vetorY = new double[5];

        // Lendo os elementos do primeiro vetor
        System.out.println("Digite os 5 elementos do primeiro vetor:");
        for (int i = 0; i < vetorX.length; i++) {
            vetorX[i] = scanner.nextDouble();
        }

        // Lendo os elementos do segundo vetor
        System.out.println("Digite os 5 elementos do segundo vetor:");
        for (int i = 0; i < vetorY.length; i++) {
            vetorY[i] = scanner.nextDouble();
        }

        // Calculando o produto escalar
        double produtoEscalar = calcularProdutoEscalar(vetorX, vetorY);

        // Imprimindo os vetores e o produto escalar
        System.out.println("Primeiro vetor:");
        imprimirVetor(vetorX);
        System.out.println("Segundo vetor:");
        imprimirVetor(vetorY);
        System.out.println("Produto escalar: " + produtoEscalar);

        scanner.close();
    }

    // Método para calcular o produto escalar entre dois vetores
    public static double calcularProdutoEscalar(double[] vetor1, double[] vetor2) {
        double produtoEscalar = 0.0;
        for (int i = 0; i < vetor1.length; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }
        return produtoEscalar;
    }

    // Método para imprimir um vetor
    public static void imprimirVetor(double[] vetor) {
        for (double num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println(); // Quebra de linha após imprimir o vetor
    }
}
