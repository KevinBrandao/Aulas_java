public class CalculadoraINSS {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        // Tabela de alíquotas e deduções do INSS
        double[][] tabelaINSS = {
            {1100.0, 7.5, 0.0},
            {2203.48, 9.0, 16.5},
            {3305.22, 12.0, 82.6},
            {6433.57, 14.0, 148.72}
        };

        // Pedindo ao usuário para inserir o salário bruto
        System.out.println("##########################");
        System.out.println("CALCULADORA DE INSS");
        System.out.println("##########################");
        System.out.print("Salário Bruto ....: ");
        double salarioBruto = scanner.nextDouble();

        // Calculando o desconto do INSS
        double descontoINSS = 0.0;
        for (int i = 0; i < tabelaINSS.length; i++) {
            if (salarioBruto <= tabelaINSS[i][0]) {
                descontoINSS = (salarioBruto * tabelaINSS[i][1] / 100) - tabelaINSS[i][2];
                break;
            }
        }

        // Calculando o salário líquido
        double salarioLiquido = salarioBruto - descontoINSS;

        // Exibindo os resultados
        System.out.println("Alíquota INSS (%).: " + tabelaINSS[0][1]);
        System.out.println("Desconto INSS .....: " + String.format("%.2f", descontoINSS));
        System.out.println("Salário Líquido ...: " + String.format("%.2f", salarioLiquido));
        System.out.println("##########################");

        // Fechando o scanner
        scanner.close();
    }
}
