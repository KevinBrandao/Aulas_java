package ListaPrimeiraParte;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] primeiroVetor = new int[10];
        int[] segundoVetor = new int[3];
        boolean[] contados = new boolean[3];
        int menoresQueReferencia = 0, iguaisAReferencia = 0, numerosNoPrimeiroVetor = 0;

        // le 10 num p/ o vetor 1
        System.out.println("Digite 10 nºs  inteiros para o 1º vetor:");
        for (int i = 0; i < primeiroVetor.length; i++) {
            primeiroVetor[i] = scanner.nextInt();
        }

        System.out.println("Digite o valor de referência:");
        int valorReferencia = scanner.nextInt();// pede valor referência

        // saída vetor 1
        System.out.println("nºs maiores q o valor de referência no 1º vetor:");
        for (int num : primeiroVetor) {
            if (num > valorReferencia) {
                System.out.println(num);
            } else if (num < valorReferencia) {
                menoresQueReferencia++;
            } else {
                iguaisAReferencia++;
            }
        }

        System.out.println("Qde de nºs menores q valor de referência: " + menoresQueReferencia);
        System.out.println("O valor de referência aparece " + iguaisAReferencia + " vezes no 1º vetor.");
        System.out.println("------------------------------------------------");

        // le os 50 num vetor 2
        System.out.println("Digite " + segundoVetor.length + " nºs inteiros p/ o 2º vetor:");
        for (int i = 0; i < segundoVetor.length; i++) {
            segundoVetor[i] = scanner.nextInt();
        }

        // processa vetor 2
        System.out.println("Ocorrências de cada número no 2º vetor:");
        for (int i = 0; i < segundoVetor.length; i++) {
            if (!contados[i]) {
                int contagem = 1;
                for (int j = i + 1; j < segundoVetor.length; j++) {
                    if (segundoVetor[i] == segundoVetor[j]) {
                        contagem++;
                        contados[j] = true; // Marca como contado
                    }
                }
                System.out.println("Número " + segundoVetor[i] + " aparece " + contagem + " vezes no 2º vetor");
            }
        }

        // % de num vetor 2 q contam vetor 1
        for (int num : segundoVetor) {
            for (int val : primeiroVetor) {
                if (num == val) {
                    numerosNoPrimeiroVetor++;
                    break;
                }
            }
        }
        double percentual = ((double) numerosNoPrimeiroVetor / segundoVetor.length) * 100;
        System.out.printf("Percentual de nºs do 2º vetor q constam no 1º: %.2f%%\n", percentual);
    }
}
