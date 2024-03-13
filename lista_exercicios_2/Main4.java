import java.util.Scanner;

public class Main4 {
    public static void main(String... strings) {
        Scanner scanner = new Scanner(System.in);

        // Criando um vetor de 10 elementos inteiros
        int[] vetor = new int[10];

        // Lendo os elementos do vetor
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Solicitando o valor de referência
        System.out.println("Digite um valor de referência inteiro:");
        int valorReferencia = scanner.nextInt();

        // a. Imprimir os números do vetor maiores que o valor de referência
        System.out.println("Números maiores que o valor de referência:");
        for (int num : vetor) {
            if (num > valorReferencia) {
                System.out.println(num);
            }
        }

        // b. Contar quantos números do vetor são menores que o valor de referência
        int menoresQueReferencia = 0;
        for (int num : vetor) {
            if (num < valorReferencia) {
                menoresQueReferencia++;
            }
        }
        System.out.println("Quantidade de números menores que o valor de referência: " + menoresQueReferencia);

        // c. Contar quantas vezes o valor de referência aparece no vetor
        int vezesReferencia = 0;
        for (int num : vetor) {
            if (num == valorReferencia) {
                vezesReferencia++;
            }
        }
        System.out.println("Quantidade de vezes que o valor de referência aparece no vetor: " + vezesReferencia);

        scanner.close();
    }
}
