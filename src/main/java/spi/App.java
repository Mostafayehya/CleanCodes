package spi;

import java.util.ServiceLoader;

public class App {

    public static void main(String[] args) {
        ServiceLoader<MessageService> loader = ServiceLoader.load(MessageService.class);
        for (MessageService m :
                loader) {
            m.sayMessage();
        }
    }
}
