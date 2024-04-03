package ListaPrimeiraParte;

public class Main6 {
    public static void main(String[] args) {
        int tamanho = 100;
        int[] W = new int[tamanho];
        int[] J = new int[tamanho];

        // W e J com num aleatórios de 0 a 100
        for (int i = 0; i < tamanho; i++) {
            W[i] = (int) (Math.random() * 101);
            J[i] = (int) (Math.random() * 101);
        }

        // max(W) e min(J)
        int maxW = W[0];
        int minJ = J[0];
        double somaW = 0;
        double somaJ = 0;

        for (int i = 0; i < tamanho; i++) {
            if (W[i] > maxW) {
                maxW = W[i];
            }
            if (J[i] < minJ) {
                minJ = J[i];
            }
            somaW += W[i];
            somaJ += J[i];
        }

        // média(W) e média(J)
        double mediaW = somaW / tamanho;
        double mediaJ = somaJ / tamanho;

        // t
        double t = (maxW * (minJ + 1)) / (mediaW + mediaJ);

        // resultados
        System.out.println("Valor de t: " + t);
        printArray("Vetor W", W);
        printArray("Vetor J", J);
    }

    // imprimir um vetor
    public static void printArray(String title, int[] array) {
        System.out.println(title + ": ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
