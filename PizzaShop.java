class PizzaShop {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("John Doe", "1234567890", "123 Street, NY");

        // Create an order
        Order order = new Order(customer);

        // Create pizzas
        Pizza pizza1 = new Margherita();
        Pizza pizza2 = new Cheese(new Pepperoni()); // Pepperoni with extra cheese

        // Add to order
        order.addPizza(pizza1);
        order.addPizza(pizza2);

        // Print Order
        order.printOrder();

        // Payment
        Payment payment = new CreditCardPayment("1234-5678-9876-5432");
        payment.processPayment(order.calculateTotal());

        // Update Order Status
        order.updateStatus(OrderStatus.DELIVERED);
        System.out.println("Order Status Updated to: " + OrderStatus.DELIVERED);
    }
}
