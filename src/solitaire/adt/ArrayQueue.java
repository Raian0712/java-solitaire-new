/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solitaire.adt;

public class ArrayQueue<T> implements QueueInterface<T> {

    private T[] array;
    private final static int frontIndex = 0;
    private int backIndex;
    private static final int DEFAULT_CAPACITY = 40;

    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }
    
    public ArrayQueue(int initialCapacity) {
        array = (T[]) new Object [initialCapacity];
        backIndex = -1;
    }

    @Override
    public void enQueue(T newEntry) {
        if (!isArrayFull()) {
            backIndex++;
            array[backIndex] = newEntry;
        }
    }

    @Override
    public T deQueue() {
        T front = null;
        if (!isEmpty()) {
            front = array[frontIndex];
            for (int i = frontIndex; i < backIndex; ++i) {
                array[i] = array[i + 1];
            }
            backIndex--;
        } 
        return front; 
    }

    @Override
    public T getFront() {
        T front = null;
        if (!isEmpty()) {
            front = array[frontIndex];
        }
        return front;
    }

    @Override
    public boolean isEmpty() {
        return frontIndex >= backIndex;
    }

    @Override
    public void clear() {
        if (!isEmpty()) {
            for (int index = frontIndex; index <= backIndex; index++) {
                array[index] = null;
            } 
            backIndex = -1;
        }
    }
    
    private boolean isArrayFull(){
        return backIndex == array.length - 1;
    }
    
}
