public class CreditCardpayment implements Payment{
    private String cardNumber;
    public CreditCardpayment(String cardNumber){
        this.cardNumber=cardNumber;

    }
    public boolean processPayment(double amount){
        System.out.println("Processing creditCard Payment: " +amount);
        return true;
    }

}
