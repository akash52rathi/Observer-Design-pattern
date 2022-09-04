public class Main {
    public static void main(String[] args) {
        MessagePublisher messagePublisher = new MessagePublisher();
        Observer one = new Subscriber1();
        Observer two = new Subscriber2();
        messagePublisher.attach(one);
        messagePublisher.attach(two);
        messagePublisher.notifyUpdate(new Message("Firts Message"));
        messagePublisher.detach(two);
        messagePublisher.notifyUpdate(new Message("Second Message"));

    }
}
