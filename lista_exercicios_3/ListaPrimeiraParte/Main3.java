package ListaPrimeiraParte;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] w = new int[10];
        int[] k = new int[10];
        int soma = 0;

        System.out.println("Digite os 10 valores para o vetor w:");
        for (int i = 0; i < 10; i++) {
            w[i] = scanner.nextInt();
        }

        System.out.println("Digite os 10 valores para o vetor k:");
        for (int i = 0; i < 10; i++) {
            k[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            soma += (w[i] + k[9 - i]);
        }

        // resultado
        System.out.println("O resultado do cálculo é: " + soma);
    }
}
