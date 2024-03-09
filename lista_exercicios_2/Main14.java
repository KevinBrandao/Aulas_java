public class Main14 {
    public static void main(String[] args) {
        int n = 6; // Defina o valor de n
        gerarTriangulo(n);
    }

    public static void gerarTriangulo(int n) {
        // Loop para iterar pelas linhas
        for (int i = 1; i <= n; i++) {
            // Loop para imprimir os espaços em branco à esquerda
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Loop para imprimir os asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("K");
            }
            // Pula para a próxima linha após imprimir uma linha do triângulo
            System.out.println();
        }
    }
}
