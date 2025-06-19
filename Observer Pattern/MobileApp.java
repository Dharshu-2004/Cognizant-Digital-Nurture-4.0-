public class MobileApp implements Observer {
    public void update(double newPrice) {
        System.out.println("Mobile App: Price " + newPrice);
    }
}