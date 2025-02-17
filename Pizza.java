abstract class Pizza {
    protected String description = "Unknown Pizza";
    public String getDescription(){
        return description;

    }
    abstract double getCost();

}
