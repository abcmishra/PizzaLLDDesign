public class Cheese extends ToppingsDecorator{
    public Cheese(Pizza pizza)
    {
        super(pizza);
    }

    public String getDescription(){
        return pizza.getDescription() + ", Cheese";
    }

    public double getCost(){
        return pizza.getCost() + 1.50;
    }

}
