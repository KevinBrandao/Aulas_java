
package lista3.oo;

class CorporateClient extends Client {
    private String contactName;
    private String creditHistory;
    private String creditLimit;

    public CorporateClient(String name, String address, String contactName, String creditHistory, String creditLimit) {
        super(name, address);
        this.contactName = contactName;
        this.creditHistory = creditHistory;
        this.creditLimit = creditLimit;
    }

    public void remind() {
        //  método para enviar um lembrete.
    }

    public void monthBill(Integer month) {
        //  método para processar a fatura do mês.
    }
}