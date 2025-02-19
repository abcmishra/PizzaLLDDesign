enum PizzaCrust {
    THIN(0.00, "Thin"),
    THICK(1.50, "Thick"),
    STUFFED(2.50, "Stuffed"),
    WHOLE_WHEAT(1.00, "Whole Wheat");

    private final double additionalCost;
    private final String name;

    PizzaCrust(double additionalCost, String name) {
        this.additionalCost = additionalCost;
        this.name = name;
    }

    public double getAdditionalCost() {
        return additionalCost;
    }

    public String getName() {
        return name;
    }
}
