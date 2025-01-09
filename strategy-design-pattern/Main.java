public class Main {
    public static void main(String[] args) {
        Payment upiPayment = new UPIPayment(new UPI());
        upiPayment.pay();
        Payment creditCardPayment = new CreditCardPayment(new CreditCard());
        creditCardPayment.pay();
    }
}
