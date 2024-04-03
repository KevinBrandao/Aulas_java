package ListaPrimeiraParte;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] codigoProduto = new int[10];
        double[] valorUnitario = new double[10];
        int[] quantidadeVendida = new int[10];
        double[] totalItem = new double[10];

        int quantidadeTotalItens = 0;
        double valorTotalVendido = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o código do produto nº " + i + " :");
            codigoProduto[i] = scanner.nextInt();

            System.out.println("Digite o valor unitário do produto nº " + i + " :");
            valorUnitario[i] = scanner.nextDouble();

            System.out.println("Digite a quantidade vendida nº " + i + " :");
            quantidadeVendida[i] = scanner.nextInt();

            // total por item
            totalItem[i] = valorUnitario[i] * quantidadeVendida[i];

            // qde total itens e o valor total vendido
            quantidadeTotalItens += quantidadeVendida[i];
            valorTotalVendido += totalItem[i];
        }

        double quantidadeMediaItensPorVenda = (double) quantidadeTotalItens / 10;
        double valorUnitarioMedio = valorTotalVendido / quantidadeTotalItens;
        double mediaValorTotalPorItem = valorTotalVendido / 10;

        // listagem de produtos
        System.out.println("CÓDIGO\tV. UNIT\tQTD\tTOTAL ITEM");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t%d\t%.2f\n", codigoProduto[i], valorUnitario[i], quantidadeVendida[i],
                    totalItem[i]);
        }

        // resultados
        System.out.println("\nResultados:");
        System.out.println("Quantidade total de itens vendidos: " + quantidadeTotalItens);
        System.out.printf("Valor total vendido: %.2f\n", valorTotalVendido);
        System.out.printf("Quantidade média de itens por venda: %.2f\n", quantidadeMediaItensPorVenda);
        System.out.printf("Valor unitário médio: %.2f\n", valorUnitarioMedio);
        System.out.printf("Média do valor total por item: %.2f\n", mediaValorTotalPorItem);

        // parte C - pesquisa codigo
        System.out.println("\nDigite um código de produto para consulta:");
        int codigoConsulta = scanner.nextInt();
        boolean codigoEncontrado = false;

        for (int i = 0; i < 10; i++) {
            if (codigoProduto[i] == codigoConsulta) {
                System.out.println("Informações do código " + codigoConsulta + ":");
                System.out.printf("Código: %d\nValor Unitário: %.2f\nQuantidade: %d\nTotal: %.2f\n",
                        codigoProduto[i], valorUnitario[i], quantidadeVendida[i], totalItem[i]);
                codigoEncontrado = true;
                break;
            }
        }

        if (!codigoEncontrado) {
            System.out.println("Código não encontrado.");
        }
    }
}
