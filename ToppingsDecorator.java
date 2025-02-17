abstract class ToppingsDecorator extends Pizza {
    protected Pizza pizza;

    public ToppingsDecorator(Pizza pizza){
        this.pizza=pizza;
    }
    public  abstract String getDescription();
    }
}
