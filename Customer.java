import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private  String id;
    private String phone;
    private Address address;

    private List<Order> orderList;

    public Customer(String name,String id,String phone,Address address){
        this.name=name;
        this.id=id;
        this.phone=phone;
        this.address=address;
        this.orderList= new ArrayList<>();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void updateOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
