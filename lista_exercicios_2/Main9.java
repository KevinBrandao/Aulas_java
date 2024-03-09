import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main9 {
    public static void main(String[] args) {
        int[][] cartela = gerarCartela();

        // Exibir a cartela gerada
        System.out.println("Cartela de Bingo:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", cartela[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] gerarCartela() {
        int[][] cartela = new int[5][5];
        List<Integer> numerosDisponiveis = new ArrayList<>();

        // Preencher a lista com números de 0 a 99
        for (int i = 0; i < 100; i++) {
            numerosDisponiveis.add(i);
        }

        // Embaralhar os números para garantir aleatoriedade
        Collections.shuffle(numerosDisponiveis);

        // Preencher a cartela
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cartela[i][j] = numerosDisponiveis.remove(0);
            }
        }

        return cartela;
    }
}
