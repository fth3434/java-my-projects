import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> products;
    private double totalAmount;
    private PaymentMethod paymentMethod;

    public Order(Customer customer, PaymentMethod paymentMethod) {
        this.customer = customer;
        this.products = customer.getCart().getProducts();
        this.totalAmount = customer.getCart().total();
        this.paymentMethod = paymentMethod;
    }
    public void completeOrder() {
        System.out.println("Toplam tutar: " + totalAmount);
        paymentMethod.pay(totalAmount);
    }
}
