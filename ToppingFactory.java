class ToppingFactory {
    public static Pizza prepare(Pizza pizza, ToppingType... toppings) {
        for (ToppingType type : toppings) {
            switch (type) {
                case CHEESE:
                    pizza = new Cheese(pizza);
                    break;
                case OLIVES:
                    pizza = new Olives(pizza);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid topping type: " + type);
            }
        }
        return pizza;
    }
}

