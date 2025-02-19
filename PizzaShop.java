public class PizzaShop {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("John Doe", "1234567890", "123 Street, NY");

        // Create an order
        Order order = new Order(customer);

        // Create pizzas
        Pizza pizza1 = new Margherita();

        // Multiple toppings dynamically added
        Pizza pizza2 = new Cheese(new Cheese(new PepperoniPizza()));  // Double Cheese Pepperoni
        Pizza pizza3 = new Olives(new Cheese(new Margherita()));  // Margherita with Cheese & Olives

        // Add pizzas to order
        order.addPizza(pizza1);
        order.addPizza(pizza2);
        order.addPizza(pizza3);

        // Print Order
        order.printOrder();

        // Check if order is empty before processing payment
        if (order.calculateTotal() > 0) {
            // Payment
            Payment payment = new CreditCardPayment("1234-5678-9876-5432");
            order.makePayment(payment);

            // Update Order Status
            order.updateStatus(OrderStatus.DELIVERED);
            System.out.println("✅ Order Status Updated to: " + order.getOrderStatus());
        } else {
            System.out.println("⚠ No pizzas in the order. Cannot proceed with payment.");
        }
    }
}
