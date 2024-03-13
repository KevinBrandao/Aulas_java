import java.util.Scanner;

class Produto {
    int codigo;
    int quantidade;
    double valorCompra;
    double valorVenda;
}

public class Main1 {
    public static void main(String... strings) {
        Scanner scanner = new Scanner(System.in);

        // Criando um array para armazenar os produtos
        Produto[] produtos = new Produto[30];

        // Inicializando os produtos
        for (int i = 0; i < produtos.length; i++) {
            produtos[i] = new Produto();
            produtos[i].codigo = i + 1; // Considerando que os códigos começam em 1
            System.out.println("Digite a quantidade do produto " + produtos[i].codigo + ":");
            produtos[i].quantidade = scanner.nextInt();
            System.out.println("Digite o valor de compra do produto " + produtos[i].codigo + ":");
            produtos[i].valorCompra = scanner.nextDouble();
            System.out.println("Digite o valor de venda do produto " + produtos[i].codigo + ":");
            produtos[i].valorVenda = scanner.nextDouble();
        }

        // Menu para listar produtos
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Listar todos os produtos");
        System.out.println("2 - Listar um produto específico");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                // Listar todos os produtos
                System.out.println("Listagem de todos os produtos:");
                for (Produto produto : produtos) {
                    System.out.println("Código: " + produto.codigo);
                    System.out.println("Quantidade: " + produto.quantidade);
                    System.out.println("Valor de Compra: " + produto.valorCompra);
                    System.out.println("Valor de Venda: " + produto.valorVenda);
                    System.out.println("-------------------------");
                }
                break;
            case 2:
                // Listar um produto específico
                System.out.println("Digite o código do produto que deseja listar:");
                int codigoDesejado = scanner.nextInt();
                for (Produto produto : produtos) {
                    if (produto.codigo == codigoDesejado) {
                        System.out.println("Código: " + produto.codigo);
                        System.out.println("Quantidade: " + produto.quantidade);
                        System.out.println("Valor de Compra: " + produto.valorCompra);
                        System.out.println("Valor de Venda: " + produto.valorVenda);
                        break;
                    }
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
