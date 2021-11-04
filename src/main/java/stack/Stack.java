package stack;

public interface Stack {

    boolean isEmpty();

    int getSize();

    void push(int element) ;

    int pop();

    int top() throws RuntimeException;

    public static class IllegalCapacity extends RuntimeException {
    }
}
