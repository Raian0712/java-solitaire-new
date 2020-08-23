package solitaire.adt;

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
        T result = null;                 // return value

        if ((position >= 1) && (position <= length)) {
            if (position == 1) {      // case 1: remove first entry
                result = firstNode.data;     // save entry to be removed
                firstNode = firstNode.next;
            } else {                         // case 2: givenPosition > 1
                Node nodeBefore = firstNode;
                for (int i = 1; i < position - 1; ++i) {
                    nodeBefore = nodeBefore.next;		// advance nodeBefore to its next node
                }
                result = nodeBefore.next.data;  // save entry to be removed
                nodeBefore.next = nodeBefore.next.next;	// make node before point to node after the
            } 																// one to be deleted (to disconnect node from chain)

            length--;
        }

        return result; // return removed entry, or null if operation fails
    }

    @Override
    public boolean clear() {
        firstNode.next = null;
        length = 0;
        return true;
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
        return false;
    }

    @Override
    //Splits the linkedlist into 2 lists, returns the splitted linked list.
    //suppose linkedlist have {10, 20, 30, 40, 50}, list.split(4) will return {40, 50}.
    public LinkedListInterface<T> split(int startPos) {
        if (startPos > length) {
            return null;
        } else {
            int startPosForRemove = startPos; //only used during the second split.
            
            //First split, will be returned
            LinkedListInterface<T> arrSplit = new LinkedList<>();
            while (startPos <= length) {
                arrSplit.add(this.getEntry(startPos++));
            }
            
            //Second split
            Node currentNode = firstNode;
            for (int i = 0; i < length - 1; i++) {
                currentNode = currentNode.next;
            }
            
            System.out.println(length);
            System.out.println(startPosForRemove);
            for (int i = length; i >= startPosForRemove; i--) {
                this.remove(i);
            }
            
            currentNode.next = null;
            
            return arrSplit;
        }
    }

    @Override
    //if arr = {10, 20} and anotherArr = {30, 40, 50}
    //then after arr.join(anotherArr), arr = {10, 20, 30, 40, 50} while anotherArr will be null
    public void join(LinkedListInterface<T> newPiles) {
        while (newPiles.length() >= 1) {
            this.add(newPiles.remove(1));
        }
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
