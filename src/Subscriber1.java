public class Subscriber1  implements Observer{

    @Override
    public void update(Message m) {
        System.out.println(this.getClass() + " " + m.getMessageContent());
    }
}
