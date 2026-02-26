import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

        // Müşteri oluşturma
        Customer customer = new Customer("Fatih", "fatih@mail.com");

        // Ürün oluşturma
        Product p1 = new Elektronik("Laptop", 5, 20000);
        Product p2 = new Kitap("Java Kitabı",7, 350);
        Product p3 = new Giyim("T-Shirt", 9, 250);

        // Sepete ekleme
        customer.getCart().add(p1);
        customer.getCart().add(p2);
        customer.getCart().add(p3);

        // Toplam tutarı göster
        double total = customer.getCart().total();
        System.out.println("Sepet Toplamı: " + total + " TL");


        // Farklı ödeme yöntemleri
        System.out.println("\nÖdeme yöntemi seçiniz:");
        System.out.println("1 - Kredi Kartı");
        System.out.println("2 - Nakit");
        System.out.println("3 - Havale");
        System.out.print("Seçim: ");
        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();

        PaymentMethod paymentMethod = null;

        switch (secim) {
            case 1:
                paymentMethod = new KrediKarti();
                break;
            case 2:
                paymentMethod = new Nakit();
                break;
            case 3:
                paymentMethod = new Havale();
                break;
            default:
                System.out.println("Geçersiz seçim!");
                System.exit(0);
        }

        Order order = new Order(customer, paymentMethod);

        // Ödeme yap
        order.completeOrder();
    }
}
