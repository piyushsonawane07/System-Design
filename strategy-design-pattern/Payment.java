class Payment {
    PaymentGateway paymentgateway;
    public Payment(PaymentGateway paymentgateway) {
        this.paymentgateway = paymentgateway;
    }
    public void pay() {
        paymentgateway.pay();
    }
}