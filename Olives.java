public class Olives extends ToppingsDecorator{
    public Olives(Pizza pizza){
        super(pizza);
    }

    public String getDescription(){
        return pizza.getDescription()+", Olives";
    }
    public double getCost(){
        return pizza.getCost()+2.50;
    }
}
