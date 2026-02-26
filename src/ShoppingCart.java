import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void add(Product p) {
        products.add(p);
    }

    public void remove(Product p) {
        products.remove(p);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double total() {
        double total = 0;
        for (Product p : products) {
            total += p.getFiyat();
        }
        return total;
    }

}

