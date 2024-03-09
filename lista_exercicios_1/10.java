import java.util.Scanner;

class Venda {
    private int codigoProduto;
    private double valorUnitario;
    private int quantidade;

    public Venda(int codigoProduto, double valorUnitario, int quantidade) {
        this.codigoProduto = codigoProduto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return valorUnitario * quantidade;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Venda[] vendas = new Venda[10];

        double totalVendido = 0;
        int quantidadeTotal = 0;

        // Solicitar informações das vendas
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe os dados da venda " + (i + 1) + ":");
            System.out.print("Código do produto: ");
            int codigoProduto = scanner.nextInt();
            System.out.print("Valor unitário: ");
            double valorUnitario = scanner.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();

            vendas[i] = new Venda(codigoProduto, valorUnitario, quantidade);

            double valorTotalVenda = vendas[i].calcularValorTotal();
            totalVendido += valorTotalVenda;
            quantidadeTotal += quantidade;

            System.out.println("Valor total da venda: " + valorTotalVenda);
        }

        // Calcular valor médio vendido
        double valorMedioVendido = totalVendido / 10;

        // Encontrar a maior e menor venda
        Venda maiorVenda = vendas[0];
        Venda menorVenda = vendas[0];
        for (int i = 1; i < 10; i++) {
            if (vendas[i].calcularValorTotal() > maiorVenda.calcularValorTotal()) {
                maiorVenda = vendas[i];
            }
            if (vendas[i].calcularValorTotal() < menorVenda.calcularValorTotal()) {
                menorVenda = vendas[i];
            }
        }

        // Exibir resultados
        System.out.println("\nValor médio vendido: " + valorMedioVendido);
        System.out.println("Produto com maior venda:");
        System.out.println("Código do produto: " + maiorVenda.getCodigoProduto());
        System.out.println("Quantidade: " + maiorVenda.getQuantidade());
        System.out.println("Valor total da venda: " + maiorVenda.calcularValorTotal());
        System.out.println("Produto com menor venda:");
        System.out.println("Código do produto: " + menorVenda.getCodigoProduto());
        System.out.println("Quantidade: " + menorVenda.getQuantidade());
        System.out.println("Valor total da venda: " + menorVenda.calcularValorTotal());
        System.out.println("Valor total vendido: " + totalVendido);
        System.out.println("Quantidade total de itens vendidos: " + quantidadeTotal);
    }
}
