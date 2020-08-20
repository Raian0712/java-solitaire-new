package solitaire.adt;

public interface SortedListInterface<T extends Comparable<T>> 
{
    public void add (T newEntry);
    public boolean remove(T anEntry);
    public boolean isEmpty();
    public void clear();
    
}