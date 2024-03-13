import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo os conjuntos de números
        int[] conjunto1 = new int[10];
        int[] conjunto2 = new int[10];

        // Lendo os elementos do primeiro conjunto
        System.out.println("Digite os elementos do primeiro conjunto:");
        for (int i = 0; i < conjunto1.length; i++) {
            conjunto1[i] = scanner.nextInt();
        }

        // Lendo os elementos do segundo conjunto
        System.out.println("Digite os elementos do segundo conjunto:");
        for (int i = 0; i < conjunto2.length; i++) {
            conjunto2[i] = scanner.nextInt();
        }

        // Encontrando elementos comuns usando um HashSet
        Set<Integer> elementosComuns = new HashSet<>();
        for (int num1 : conjunto1) {
            for (int num2 : conjunto2) {
                if (num1 == num2) {
                    elementosComuns.add(num1);
                    break; // Não é necessário continuar a busca se o elemento foi encontrado
                }
            }
        }

        // Exibindo os elementos comuns
        if (elementosComuns.isEmpty()) {
            System.out.println("Não há elementos comuns nos conjuntos.");
        } else {
            System.out.println("Elementos comuns aos conjuntos:");
            for (int elemento : elementosComuns) {
                System.out.println(elemento);
            }
        }

        scanner.close();
    }
}
