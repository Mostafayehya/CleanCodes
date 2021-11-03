package stack;

public class Stack {
    private boolean isEmpty = true;
    private int capacity;
    private int size = 0;
    private int[] data;

    public static Stack Make(int capacity) {
        if (capacity < 0)
            throw new IllegalCapacity();
        return new Stack(capacity);
    }

    private Stack(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public int getSize() {
        return size;
    }

    public void push(int element) throws OverFlow {
        if (size == capacity)
            throw new OverFlow();
        data[size++] = element;
    }

    public int pop() {
        if (isEmpty())
            throw new UnderFlow();

        return data[--size];
    }

    public class OverFlow extends RuntimeException {
    }

    public class UnderFlow extends RuntimeException {
    }

    public static class IllegalCapacity extends RuntimeException {
    }
}
