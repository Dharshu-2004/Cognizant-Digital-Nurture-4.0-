public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String graphics;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphics = builder.graphics;
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String graphics;
        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;}
        
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Builder setGraphics(String graphics) {
            this.graphics = graphics;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
    public void displayConfig() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics: " + graphics);
    }
}
