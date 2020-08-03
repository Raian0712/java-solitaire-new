package solitaire.adt;

public interface LinkedList<T> {
    public boolean add(T newEntry);
    public boolean add(T newEntry, int position);
    public T remove(int position);
    public boolean clear();
    public boolean replace(T newEntry, int position);
    public T getEntry(int position);
    public boolean contains(T entry);
    public int length();
    public boolean isEmpty();
    public boolean isFull();
    public LinkedList<T> split(int startPos); //Maybe used to split piles of cards into 2 different piles
    public LinkedList<T> join(LinkedList<T> newPiles); //Join one pile of cards to another pile of cards
}
