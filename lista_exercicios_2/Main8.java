public class Main8 {
    public static void main(String[] args) {
        // Definindo a matriz de 10x10
        int[][] matriz = new int[10][10];

        // Preenchendo a matriz com valores aleatórios (para este exemplo)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int) (Math.random() * 10); // Valor aleatório de 0 a 9
            }
        }

        // Exibindo a matriz (apenas para visualização)
        System.out.println("Matriz:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calculando a soma dos elementos da diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 10; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        // Exibindo a soma dos elementos da diagonal principal
        System.out.println("Soma dos elementos da diagonal principal: " + somaDiagonalPrincipal);
    }
}
