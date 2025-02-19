import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Order {
    private static final AtomicInteger idCounter = new AtomicInteger(1);  // Thread-safe unique ID generator
    private int orderId;
    private double totalAmount;
    private List<Pizza> pizzaList;
    private Customer customer;
    private OrderStatus orderStatus;

    public Order(Customer customer) {
        this.orderId = idCounter.getAndIncrement();
        this.customer = customer;
        this.pizzaList = new ArrayList<>();
        this.orderStatus = OrderStatus.PLACED;
    }

    public void addPizza(Pizza pizza) {
        pizzaList.add(pizza);
    }

    public double calculateTotal() {
        totalAmount = 0;
        for (Pizza pizza : pizzaList) {
            totalAmount += pizza.getCost();  // Fixed method call
        }
        return totalAmount;  // Return total amount instead of void
    }

    public void updateStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void makePayment(Payment payment) {
        printOrder();
        payment.processPayment(this.totalAmount);  // Avoid recalculating total amount
        this.customer.getOrderList().add(this);
    }

    public void printOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("Total Amount: $" + totalAmount);

        for (Pizza pizza : pizzaList) {
            System.out.println(" - " + pizza.getDescription() + " ($" + pizza.getCost() + ")");
        }
    }
}
