public class Main{
    public static void main(String[] args){
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Start");
        logger2.log("stop");

        if(logger1==logger2){
            System.out.println("Both are in same instance");
        }
        else{
            System.out.println("Different instances");
        }
    }
}