public class Logger{
    private static Logger instance;
    
    private Logger(){
        System.out.print("Logger initialized");
    }
    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message){
        System.out.println("Logging"+ message);
    }
}