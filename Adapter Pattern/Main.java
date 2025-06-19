public class Main {
    public static void main(String[] args) {
       PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalGateway());
        payPalProcessor.processPayment(500.0);
}
}