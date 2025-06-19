public class Main {
    public static void main(String[] args) {
        Computer basic = new Computer.Builder("BBB", "8GB") .build();
         Computer gaming = new Computer.Builder("AAA", "16GB").setStorage("AAAA").setGraphics("GG").build();

        System.out.println("Basic Computer:");
        basic.displayConfig();

        System.out.println("\nGaming Computer:");
        gaming.displayConfig();
    }
}
