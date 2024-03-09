public class Main11 {
    public static void main(String[] args) {
        // Exemplo de horas, minutos e segundos
        int horas = 42;
        int minutos = 30;
        int segundos = 45;

        // Chamada da função para converter para segundos
        int totalSegundos = converterParaSegundos(horas, minutos, segundos);

        // Exibindo o resultado
        System.out.println("Total de segundos: " + totalSegundos);
    }

    public static int converterParaSegundos(int horas, int minutos, int segundos) {
        // Calculando o total de segundos
        int totalSegundos = horas * 3600 + minutos * 60 + segundos;

        return totalSegundos;
    }
}
