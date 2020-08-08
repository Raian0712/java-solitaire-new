package solitaire.adt;

public interface StackInterface<T> {
    public int capacity();
    public int size();
    public boolean isEmpty();
    //Stack specific
    public void push(T entry);
    public T pop();
    public T peek();
    public void clear();
    public int search(T entry);
}
