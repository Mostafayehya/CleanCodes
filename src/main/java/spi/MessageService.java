package spi;

public abstract class MessageService {
    public static final int CHAT_MESSAGE = 1;
    public static final int GREETING_MESSAGE = 2;

    public abstract void sayMessage();
}
