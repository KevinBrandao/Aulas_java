public class VerificadorNumeroPrimo {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        // Pedindo ao usuário para inserir o número
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        boolean primo = true;

        // Verificando se o número é primo
        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        // Exibindo o resultado
        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        // Fechando o scanner
        scanner.close();
    }
}