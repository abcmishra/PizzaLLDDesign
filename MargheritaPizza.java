class MargheritaPizza extends Pizza {
    public MargheritaPizza(PizzaSize size, PizzaCrust crust) {
        super("Margherita Pizza (" + size.name() + ", " + crust.getName() + " crust)",
                8.00 + size.getAdditionalCost() + crust.getAdditionalCost());
    }

    @Override
    public double getCost() {
        return baseCost;
    }
}


