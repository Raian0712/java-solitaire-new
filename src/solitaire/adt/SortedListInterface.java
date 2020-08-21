package solitaire.adt;

import java.util.Iterator;

public interface SortedListInterface<T extends Comparable<T>> 
{
   public Iterator<T> getIterator();
    
  public boolean add(T newEntry);

  public boolean remove(T anEntry);

  public boolean contains(T anEntry);

  public void clear();

  public int getLength();

  public boolean isEmpty();
}