import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um vetor de 100 elementos inteiros
        int[] vetor = new int[100];

        // Lendo os elementos do vetor
        System.out.println("Digite os 100 elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Encontrando o maior e o menor elemento
        int maior = vetor[0];
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        // Calculando o percentual de números pares
        int numerosPares = 0;
        for (int num : vetor) {
            if (num % 2 == 0) {
                numerosPares++;
            }
        }
        double percentualPares = (double) numerosPares / vetor.length * 100;

        // Calculando a média dos elementos
        int soma = 0;
        for (int num : vetor) {
            soma += num;
        }
        double media = (double) soma / vetor.length;

        // Imprimindo os resultados
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
        System.out.println("Percentual de números pares: " + percentualPares + "%");
        System.out.println("Média dos elementos: " + media);

        scanner.close();
    }
}
