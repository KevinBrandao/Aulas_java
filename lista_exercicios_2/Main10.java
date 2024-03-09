public class Main10 {
    public static void main(String... strings) {
        // Raio da esfera
        double raio = 5.0;

        // Calcular o volume da esfera
        double volume = calcularVolumeEsfera(raio);

        // Exibir o resultado
        System.out.println("Volume da esfera com raio " + raio + ": " + volume);
    }

    public static double calcularVolumeEsfera(double raio) {
        double pi = Math.PI;

        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);

        return volume;
    }
}
