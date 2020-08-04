/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire.adt;

/**
 *
 * @author USER
 */
public class LinkedList<T> implements LinkedListInterface<T> {

    private Node firstNode;
    private int length = 0;

    @Override
    public boolean add(T newEntry) {
        Node newNode = new Node(newEntry);
        
        if (isEmpty()) {
            firstNode = newNode;
        } else {
            Node currentNode = firstNode;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        length++;
        return true;
    }

    @Override
    public boolean add(T newEntry, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T remove(int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean replace(T newEntry, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T getEntry(int position) {
        T result = null;

        if ((position >= 1) && (position <= length)) {
            Node currentNode = firstNode;
            for (int i = 0; i < position - 1; ++i) {
                currentNode = currentNode.next;		// advance currentNode to next node
            }
            result = currentNode.data;	// currentNode is pointing to the node at givenPosition
        }

        return result;
    }

    @Override
    public boolean contains(T entry) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    //Splits the linkedlist into 2 lists, returns the splitted linked list.
    //suppose linkedlist have {10, 20, 30, 40, 50}, list.split(4) will return {40, 50}.
    public LinkedListInterface<T> split(int startPos) {
        if (startPos > length) {
            return null;
        } else {
            //First split
            Node currentNode = firstNode;
            //i dont even know why need to minus 2 and not 1 wtf
            for (int i = 0; i < startPos - 2; i++) {
                currentNode = currentNode.next;	
            }
            
            //Second split, will be returned
            LinkedListInterface<T> arrSplit = new LinkedList<>();
            while (startPos <= length) {
                arrSplit.add(this.getEntry(startPos++));
            }
            
            currentNode.next = null;
            
            return arrSplit;
        }
    }

    @Override
    public LinkedListInterface<T> join(LinkedListInterface<T> newPiles) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    
    @Override
    public String toString() {
        String outputStr = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
            outputStr += currentNode.data + "\n";
            currentNode = currentNode.next;
        }
        return outputStr;
    }

}
