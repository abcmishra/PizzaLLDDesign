abstract class Pizza {
    protected String description;
    protected double baseCost;

    public Pizza(String description, double baseCost) {
        this.description = description;
        this.baseCost = baseCost;
    }

    public String getDescription() {
        return description;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public abstract double getCost();
}
