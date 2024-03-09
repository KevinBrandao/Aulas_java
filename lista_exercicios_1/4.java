public class ContNegativos {
    public static void main(String... args) {
        //Scanner é uma classe em Java que fornece métodos para
        //analisar tipos de dados primitivos e strings a partir de 
        //fontes de entrada, como o teclado,
        // arquivos e strings. Ele é encontrado no pacote java.util.
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir o número de valores
        System.out.print("Digite o número de valores a serem inseridos: ");
        // nextInt Este método espera que o próximo token de entrada seja
        // um número inteiro e o converte para o tipo 
        int n = scanner.nextInt();

        int contadorNegativos = 0;

        // Pedindo ao usuário para inserir os valores e contando os negativos
        System.out.println("Digite os valores:");
        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            if (valor < 0) {
                contadorNegativos++;
            }
        }

        // Exibindo o resultado
        System.out.println("Total de valores negativos: " + contadorNegativos);

        // Fechando o scanner
        scanner.close();
    }
}