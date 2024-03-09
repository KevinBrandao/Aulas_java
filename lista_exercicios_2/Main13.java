public class Main13 {
    public static void main(String[] args) {
        int n = 5; // Defina o valor de n
        gerarExclamacoes(n);
    }

    public static void gerarExclamacoes(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("KEVIN ! ");
            }
            System.out.println(); // Pula para a próxima linha após imprimir os pontos de exclamação
        }
    }
}
