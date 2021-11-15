package spi;

public class GreetingMessageService extends MessageService{
    @Override
    public void sayMessage() {
        System.out.println("This is a greeting Message");
    }
}
