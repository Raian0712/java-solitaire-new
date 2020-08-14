package solitaire.adt;

public class ArrayStack<T> implements StackInterface<T> {
    private T[] array;
    private static final int DEFAULT_CAPACITY = 2;
    private int topIndex = 0;
    
    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }
    
    public ArrayStack(int initCapacity) {
        array = (T[])new Object[initCapacity];
        topIndex = -1;
    }

    @Override
    public int capacity() {
        return array.length;
    }

    @Override
    public int size() {
        return topIndex + 1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

    @Override
    public void push(T entry) {
        topIndex++;
        
        if (topIndex >= array.length) {
            doubleArray();
        }
        
        array[topIndex] = entry;
        
    }
    
    private void doubleArray() {
        T[] oldArray = array;
        array = (T[]) new Object[2 * oldArray.length];
        for (int i = 0; i < oldArray.length; i++) {
            array[i] = oldArray[i];
        }
    }

    @Override
    public T pop() {
        T top = null;
        
        if (!isEmpty()) {
            top = array[topIndex];
            array[topIndex] = null;
            topIndex--;
        }
        
        return top;
    }

    @Override
    public T peek() {
        T top = null;
        
        if (!isEmpty()) {
            top = array[topIndex];
        }
        
        return top;
    }

    @Override
    public int search(T entry) {
        int index = -1;
        
        for (int i = 0; i < size(); i++) {
            if (array[i] == entry || array[i].equals(entry)) {
                index = i;
            }
        }
        
        return index;
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
            topIndex--;
        }
    }

    @Override
    public T get(int index) {
        T data = null;
        
        if (!isEmpty() && index < array.length) {
            data = array[index];
        }
        
        return data;
    }
    
    @Override
    public void set(int index, T entry) {
        if (!isEmpty() && index < array.length) {
            array[index] = entry;
        }
    }
}
