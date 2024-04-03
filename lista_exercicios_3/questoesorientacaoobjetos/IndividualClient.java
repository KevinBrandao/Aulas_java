
package lista3.oo;

class IndividualClient extends Client {
    private String creditCardNumber;

    public IndividualClient(String name, String address, String creditCardNumber) {
        super(name, address);
        this.creditCardNumber = creditCardNumber;
    }
}