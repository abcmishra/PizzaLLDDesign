class PepperoniPizza extends Pizza {
    public PepperoniPizza(PizzaSize size, PizzaCrust crust) {
        super("Pepperoni Pizza (" + size.name() + ", " + crust.getName() + " crust)",
                10.00 + size.getAdditionalCost() + crust.getAdditionalCost());
    }

    @Override
    public double getCost() {
        return baseCost;
    }
}