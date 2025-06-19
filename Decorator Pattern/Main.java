
public class Main {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier();
        Notifier emailAndSms = new SMSNotifierDecorator(email);
        Notifier fullNotifier = new SlackNotifierDecorator(emailAndSms);

        fullNotifier.send("Hello");
    }
}
