public class Main12 {
    public static void main(String... strings) {
        // Exemplo de valores para X e Z
        int x = 2;
        int z = 5;

        // Chamada da função para calcular a potência
        long resultado = calcularPotencia(x, z);

        // Exibindo o resultado
        System.out.println("Resultado de " + x + "^" + z + " = " + resultado);
    }

    public static long calcularPotencia(int x, int z) {
        // Inicializando o resultado como 1
        long resultado = 1;

        // Loop para calcular a potência
        for (int i = 0; i < z; i++) {
            resultado *= x;
        }

        return resultado;
    }
}
