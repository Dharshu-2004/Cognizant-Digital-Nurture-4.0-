
public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("one.jpg");
        image1.display();
        image1.display();

        System.out.println();

        Image image2 = new ProxyImage("two.jpg");
        image2.display();
    }
}
