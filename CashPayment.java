public class CashPayment implements Payment{
    public boolean processPayment(double amount){
        System.out.println("Processing cash Payment of $ "+amount);
        return true;

    }
}
