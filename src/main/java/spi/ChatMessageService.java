package spi;

public class ChatMessageService extends MessageService {
    @Override
    public void sayMessage() {
        System.out.println("This is a chat Message");
    }
}
