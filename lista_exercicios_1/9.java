import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Investimento {
    private String nome;
    private double taxaSelic;
    private double taxaAdministrativa;
    private double imposto;
    private double capital;

    public Investimento(String nome, double taxaSelic, double taxaAdministrativa, double imposto, double capital) {
        this.nome = nome;
        this.taxaSelic = taxaSelic;
        this.taxaAdministrativa = taxaAdministrativa;
        this.imposto = imposto;
        this.capital = capital;
    }

    public String getNome() {
        return nome;
    }

    public List<Double> calcularRendimento() {
        List<Double> rendimentos = new ArrayList<>();
        double total = capital;

        for (int i = 1; i <= 12; i++) {
            double rendimentoMes = capital * (taxaSelic * (nome.equals("CDB Banco Pague Mais") ? 0.85 : 0.93));
            rendimentoMes -= rendimentoMes * taxaAdministrativa;
            if (nome.equals("CBD Fura Bolso")) {
                rendimentoMes -= rendimentoMes * imposto;
            }
            total += rendimentoMes;
            rendimentos.add(rendimentoMes);
        }
        rendimentos.add(total);
        return rendimentos;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a taxa Selic: ");
        double taxaSelic = scanner.nextDouble();

        System.out.print("Informe o capital para aplicação: ");
        double capital = scanner.nextDouble();

        Investimento cdbPagueMais = new Investimento("CDB Banco Pague Mais", taxaSelic, 0.10, 0, capital);
        Investimento cdbFuraBolso = new Investimento("CBD Fura Bolso", taxaSelic, 0.01, 0.06, capital);

        System.out.println("\nInvestimento CDB Banco Pague Mais:");
        exibirResultados(cdbPagueMais.calcularRendimento());

        System.out.println("\nInvestimento CDB Fura Bolso:");
        exibirResultados(cdbFuraBolso.calcularRendimento());
    }

    public static void exibirResultados(List<Double> rendimentos) {
        double total = rendimentos.get(rendimentos.size() - 1);
        double descontos = total - rendimentos.get(0) * 12;
        double rendimentoLiquido = total - descontos;

        System.out.println("Taxa Selic: " + rendimentos.get(0));
        System.out.println("Capital investido: " + rendimentos.get(0));
        System.out.println("Mes Capital Rendimento Total");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%d %.2f %.2f %.2f%n", i + 1, rendimentos.get(0), rendimentos.get(i), rendimentos.get(i) + rendimentos.get(0));
        }
        System.out.printf("Rendimento Total: %.2f%n", total);
        System.out.printf("Descontos: %.2f%n", descontos);
        System.out.printf("Rendimento Líquido: %.2f%n", rendimentoLiquido);
    }
}
