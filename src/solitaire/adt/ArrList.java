package solitaire.adt;

public class ArrList<T> implements ListInterface<T>
{
  private T[] array;
  private int length;
  private static final int DEFAULT_CAPACITY = 10;

  public ArrList()
  {
    this(DEFAULT_CAPACITY);
  }

  public ArrList(int initialCapacity)
  {
    length = 0;
    array = (T[]) new Object[initialCapacity];
  }

  public boolean add(T newEntry)
  {
    array[length] = newEntry;
    length++;
    return true;
  }

  public boolean add(int newPosition, T newEntry)
  {
    boolean isSuccessful = true;

    if ((newPosition >= 1) && (newPosition <= length + 1))
    {
      if (!isArrayFull())
      {
        makeRoom(newPosition);
        array[newPosition - 1] = newEntry;
        length++;
      }
    } 
    else
    {
      isSuccessful = false;
    }
    return isSuccessful;
  }

  public T remove(int givenPosition)
  {
    T result = null;

    if ((givenPosition >= 1) && (givenPosition <= length))
    {
      result = array[givenPosition - 1];

      if (givenPosition < length)
      {
        removeGap(givenPosition);
      }

      length--;
    }

    return result;
  }

  public void clear()
  {
    length = 0;
  }

  public boolean replace(int givenPosition, T newEntry)
  {
    boolean isSuccessful = true;

    if ((givenPosition >= 1) && (givenPosition <= length))
    {
      array[givenPosition - 1] = newEntry;
    }
    else
    {
      isSuccessful = false;
    }

    return isSuccessful;
  }

  public T getEntry(int givenPosition)
  {
    T result = null;

    if ((givenPosition >= 1) && (givenPosition <= length))
    {
      result = array[givenPosition - 1];
    }

    return result;
  }

  public boolean contains(T anEntry)
  {
    boolean found = false;
    for (int index = 0; !found && (index < length); index++)
    {
      if (anEntry.equals(array[index]))
      {
        found = true;
      }
    }
    return found;
  }

  public int getLength()
  {
    return length;
  }

  public boolean isEmpty()
  {
    return length == 0;
  }

  public boolean isFull()
  {
    return false;
  }

  public String toString()
  {
    String outputStr = "";
    for (int index = 0; index < length; ++index)
    {
      outputStr += array[index] + "\n";
    }
    return outputStr;
  }

  private boolean isArrayFull()
  {
    return length == array.length;
  }

  private void makeRoom(int newPosition)
  {
    int newIndex = newPosition - 1;
    int lastIndex = length - 1;

    for (int index = lastIndex; index >= newIndex; index--)
    {
      array[index + 1] = array[index];
    }
  }

  private void removeGap(int givenPosition)
  {
    int removedIndex = givenPosition - 1;
    int lastIndex = length - 1;

    for (int index = removedIndex; index < lastIndex; index++)
    {
      array[index] = array[index + 1];
    }
  } 
}