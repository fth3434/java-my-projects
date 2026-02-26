public class Customer {
    String isim;
    String email;
    ShoppingCart cart;

    public Customer(String isim, String email) {
        this.isim = isim;
        this.email = email;
        this.cart = new ShoppingCart();
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public String getIsim() {
        return isim;
    }

    }
