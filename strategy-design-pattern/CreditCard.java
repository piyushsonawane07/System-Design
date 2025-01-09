public class CreditCard implements PaymentGateway {

    @Override
    public void pay() {
        System.out.println("Credit Card Payment");
    }
    
}
