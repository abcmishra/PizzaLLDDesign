import java.util.ArrayList;
import java.util.List;

public class Order {
    private static  int idCounter=1;
    private int orderId;
    private double totalAmount;
    private List<Pizza> pizzaList;
    private Customer customer;
    private OrderStatus orderStatus;

    public Order(Customer customer){
        this.orderId=idCounter++;
        this.pizzaList= new ArrayList<>();
        this.orderStatus=OrderStatus.PLACED;
    }

    public void addPizza(Pizza pizza){
        pizzaList.add(pizza);
    }
    public double calculateTotal(){
        totalAmount=0;
        for(Pizza pizza:pizzaList){
            totalAmount+=pizza.getCost();
        }
    }

    public void updateStatus(OrderStatus orderStatus){
        this.orderStatus=orderStatus;
    }
    public void printOrder(){
        System.out.println("Orderid "+orderId);
        System.out.println("CustomerName "+customer.getName());
        System.out.println("OrderStatus "+orderStatus);
        System.out.println("Customer Address "+customer.getAddress());
        System.out.println("TotalAmount "+totalAmount);

        for(Pizza pizza:pizzaList){
            System.out.println(" _ " +pizza.getDescription()+ "(& "+pizza.getCost()+")");
        }


    }

}
