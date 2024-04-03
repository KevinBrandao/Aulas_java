package questoesorientacaoobjetos;

public class Main6 {
    public static void main(String[] args) {
        // Criar uma instância de CorporateClient
        CorporateClient corporateClient = new CorporateClient("Empresa XYZ", "Endereço XYZ", "João Contato", "Bom",
                "50000");

        // Exibir o histórico de crédito do cliente corporativo
        System.out.println("Histórico de Crédito do Cliente Corporativo: " + corporateClient.creditHistory());

        // Processar a fatura mensal do cliente corporativo
        corporateClient.monthBill(3); // Supondo que o 3 representa março

        IndividualClient individualClient = new IndividualClient("Maria", "Endereço de Maria", "1234-5678-9012-3456");

        System.out.println("Histórico de Crédito do Cliente Individual: " + individualClient.creditHistory());

        // Criar uma instância de Order
        Order order = new Order();

        // Simular o recebimento, envio e fechamento de um pedido
        order.receive();
        order.send();
        order.close();

        // Criar uma instância de OrderString
        OrderString orderString = new OrderString();
        orderString.receive(); // Esta chamada é herdada da classe Order
    }
}
