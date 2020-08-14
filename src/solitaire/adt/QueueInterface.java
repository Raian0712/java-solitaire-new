package solitaire.adt;

public interface QueueInterface<T> {
    public void enQueue(T newEntry);
    public T deQueue();
    public T getFront();
    public boolean isEmpty();
    public void clear();
}
