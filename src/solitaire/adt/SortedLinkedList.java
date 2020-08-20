package solitaire.adt;

public class SortedLinkedList<T extends Comparable<T>>
        implements SortedListInterface<T>
{

    private Node firstNode;
    
    @Override
    public void add(T newEntry)
    {
        Node newNode = new Node(newEntry);
        
        if(isEmpty() || newNode.data.compareTo(firstNode.data) < 0)
        {
            newNode.next = firstNode;
            firstNode = newNode;
        }
        else
        {
            //PreviousNode, SMALLER
            //currentNode, BIGGER
            Node previousNode = firstNode;
            Node currentNode = firstNode.next;
        
            while(currentNode != null && currentNode.data.compareTo(newEntry) < 0)
            {
            previousNode = currentNode;
            currentNode = currentNode.next;
            }
            newNode.next = currentNode;
            previousNode.next = newNode;
        }
    }

    @Override
    public String toString()
    {
        String str = "";
        for (Node currentNode = firstNode; currentNode != null; currentNode = currentNode.next)
        {
            str += currentNode.data + "\n";
        }
        return str;
    }

    @Override
    public boolean remove(T anEntry)
    {
        if(isEmpty())
        {
            return false;
        }
        
        if(firstNode.data.equals(anEntry))
        {
            firstNode = firstNode.next;
            return true;
        }
        else
        {
            Node previousNode = firstNode;
            Node currentNode = firstNode.next;
        
            while(currentNode != null && currentNode.data.compareTo(anEntry) < 0)
            {
                previousNode = currentNode;
                currentNode = currentNode.next;

                if(currentNode != null && currentNode.data.equals(anEntry))
                {
                    previousNode.next = currentNode.next;
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
    return false;
    }

    @Override
    public boolean isEmpty()
    {
        return firstNode == null;
    }

    @Override
    public void clear()
    {
        firstNode = null;
    }
    
    
    
    private class Node
    {
        T data;
        Node next;
        
        public Node(T data)
        {
            this.data = data;
        }
        
        public Node(T data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
}
