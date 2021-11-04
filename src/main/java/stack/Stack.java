package stack;

public interface Stack {

    boolean isEmpty();

    int getSize();

    void push(int element);

    int pop();

    int top() throws RuntimeException;

    int find(int i);

    class IllegalCapacity extends RuntimeException {
    }

    class OverFlow extends RuntimeException {
    }

    class UnderFlow extends RuntimeException {
    }

    class ZeroCapacityAccess extends RuntimeException {
    }

    public class ElementNotFoundException extends RuntimeException {
    }
}
