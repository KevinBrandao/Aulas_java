package ListaPrimeiraParte;

public class Main8 {
    public static void main(String[] args) {
        // acertos de cada jogador
        int[] acertos = { 8, 4, 6, 10, 9, 7, 8, 12, 5, 8 };
        int quantidadeJogadores = acertos.length;
        double[] discrepancias = new double[quantidadeJogadores];
        double[] discrepanciasQuadrado = new double[quantidadeJogadores];
        double somaAcertos = 0;
        double somaDiscrepanciasQuadrado = 0;

        // media acertos
        for (int acerto : acertos) {
            somaAcertos += acerto;
        }
        double mediaAcertos = somaAcertos / quantidadeJogadores;

        // discrepâncias (x_i)
        for (int i = 0; i < quantidadeJogadores; i++) {
            discrepancias[i] = acertos[i] - mediaAcertos;
            discrepanciasQuadrado[i] = Math.pow(discrepancias[i], 2);
            somaDiscrepanciasQuadrado += discrepanciasQuadrado[i];
        }

        // variância (S)
        double variancia = somaDiscrepanciasQuadrado / (quantidadeJogadores - 1);

        // resultados em formato tabular
        System.out.println("Jogador | Acertos (X) | x(i) | (x(i))^2");
        for (int i = 0; i < quantidadeJogadores; i++) {
            System.out.printf("%8d | %10d | %5.2f | %7.2f\n", (i + 1), acertos[i], discrepancias[i],
                    discrepanciasQuadrado[i]);
        }
        System.out.println("Variância (S): " + variancia);
    }
}
