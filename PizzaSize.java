enum PizzaSize {
    SMALL(0.00),
    MEDIUM(2.00),
    LARGE(4.00);

    private final double additionalCost;

    PizzaSize(double additionalCost) {
        this.additionalCost = additionalCost;
    }

    public double getAdditionalCost() {
        return additionalCost;
    }
}
