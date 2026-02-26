public class Havale implements PaymentMethod {
    @Override
    public void pay(double ödeme){
        System.out.println("havale ile ödeme yapılıyor..");
    }
}
