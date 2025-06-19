public class WebApp implements Observer {
    public void update(double newPrice) {
        System.out.println("Web App Price: " + newPrice);
    }
}