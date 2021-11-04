package stack;

public class BoundedStack implements Stack {
    private boolean isEmpty = true;
    private int capacity;
    private int size = 0;
    private int[] data;

    private BoundedStack(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
    }

    public static Stack Make(int capacity) {
        if (capacity < 0)
            throw new IllegalCapacity();

        if (capacity == 0) return new ZeroCapacityStack();

        return new BoundedStack(capacity);
    }

    @Override
    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void push(int element) {
        if (size == capacity)
            throw new OverFlow();
        data[size++] = element;
    }

    @Override
    public int pop() {
        if (isEmpty())
            throw new UnderFlow();

        return data[--size];
    }

    @Override
    public int top() throws RuntimeException {

        if (capacity <= 0) throw new ZeroCapacityAccess();

        return data[0];
    }

    @Override
    public int find(int i) {
        for (int j = 0; j < size; j++)
            if (data[j] == i)
                return j;
        throw new Stack.ElementNotFoundException();
    }


    private static class ZeroCapacityStack implements Stack {
        @Override
        public boolean isEmpty() {
            return true;
        }

        @Override
        public int getSize() {
            return 0;
        }

        @Override
        public void push(int element) {
            throw new OverFlow();
        }

        @Override
        public int pop() {
            throw new UnderFlow();
        }

        @Override
        public int top() {
            throw new ZeroCapacityAccess();
        }

        @Override
        public int find(int i) {
            throw new ZeroCapacityAccess();
        }

    }
}
