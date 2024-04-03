class Client {
    protected String name;
    protected String address;

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String creditHistory() {
        // método para retornar o histórico de crédito.
        return "Detalhes do histórico de crédito";
    }
}