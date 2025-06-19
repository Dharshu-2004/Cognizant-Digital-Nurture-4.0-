
public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
 Observer mobile = new MobileApp();
        Observer web = new WebApp();
market.registerObserver(mobile);
        market.registerObserver(web);
market.setStockPrice(1025.5); 
System.out.println();
market.removeObserver(mobile);
        market.setStockPrice(1050.0); 
    }
}
