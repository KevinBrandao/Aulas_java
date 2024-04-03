package ListaPrimeiraParte;

public class Main7 {
    public static void main(String[] args) {
        int tamanho = 100;
        double[] J = new double[tamanho];

        // vetor J preenchido com 100 valores
        for (int i = 0; i < tamanho; i++) {
            J[i] = Math.random() * 100;
        }

        // média (m)
        double soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += J[i];
        }
        double media = soma / tamanho;

        // soma dos quadrados dos desvios da média
        double somaQuadrados = 0;
        for (int i = 0; i < tamanho; i++) {
            somaQuadrados += Math.pow(J[i] - media, 2);
        }

        // desvio padrão
        double desvioPadrao = Math.sqrt(somaQuadrados / (tamanho - 1));

        // resultado
        System.out.println("Desvio padrão: " + desvioPadrao);
    }
}
