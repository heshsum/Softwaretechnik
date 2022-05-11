/*
 * MyArrayList.java
 *
 * Copyright (c) 2020
 * All Rights Reserved.
 *
 * @version 1.00 - 20 Apr 2020 - HS - initial version
 */

/**
 * An implementation of the MyArrayListInterface.
    * <br><code><b>[OMI-GP2-EA2b]</b></code>
 *
 * @version 1.00 - 20 Apr 2020 - HS - initial version
 * @author   Hendrik Schlange (mail@hendrikschlange.de)
 * @param <E> the element to add to the MyArrayList
 */
public class MyArrayList<E> implements MyArrayListInterface<E> {

    /** The last element of the MyArrayList. */
    int lastElementIndex;

    /** The internal length of the MyArrayList. */
    int internalLength;

    /** The array to hold the elements. */
    private E[] list;

    /** The initial capacity of the MyArrayList. */
    private int capacity;

    /** The size increment when enlarging the MyArrayList. */
    private int increment;

    /**
     * Constructor for MyArrayList objects.
     * @param c the initial capacity of the MyArrayList
     * @param inc the size increment when enlarging the MyArrayList
     */
    @SuppressWarnings("unchecked")
    public MyArrayList(int c, int inc) {
        if (c > 0) {
            this.capacity = c;
        } else {
            this.capacity = 10;
        }
        /*
         * This differs from the given code,
         * as the given code had a bug in case c == 0:
         * Given:
         * list = (E[]) new Object[capacity];
         */
        list = (E[]) new Object[capacity];
        if (inc > 0) {
            this.increment = inc;
        } else {
            this.increment = 1;
        }
    }

    /**
     * Gets the capacity of the MyArrayList.
     * @return the capacity of the MyArraylist
     */
    @Override
    public int getCapacity() {
        return this.list.length;
    }

    /**
     * Gets the number of elements in the MyArrayList.
     * @return the number of elements in the MyArrayList.
     */
    @Override
    public int getSize() {
        // Counter for the number of elements.
        int elementCounter = 0;
        // Iterating over the whole array and incrementing the counter for every
        // index position that is filled in
        for (int i = 0; i <= this.getCapacity() - 1; i++) {
            if (list[i] != null) {
                elementCounter++;
            }
        }
        return elementCounter;
    }

    /**
     * Adds an element to the MyArrayList.
     * @param e the element to add
     */
    @SuppressWarnings("unchecked")
    @Override
    public void add(E e) {
        // If the current capacity equals the current internal array's size
        // (if the MyArrayList if full), create a new, temporary, array with the
        // current capacity + increment size.
        // Then overwrite the current array with the temporary array
        if (this.getCapacity() - 1 == this.getLastIndex()) {
            Object[] tempArray = new Object[this.getCapacity() + increment];
            System.arraycopy(this.list, 0, tempArray, 0, this.getSize());
            this.list = (E[]) tempArray;
        }
        this.list[getLastIndex() + 1] = e;
    }

    /**
     * Gets the index of the last element of the MyArrayList.
     * Iterates from the last possible index position backwards and returns the first value.
     * Otherwise returns "-1".
     * @return the index of the last element
     * @throws NullPointerException if MyArrayList object is empty
     */
    public int getLastIndex() {
        for (int i = this.getCapacity() - 1; i >= 0; i--) {
            if (this.list[i] != null) {
                return i;
            }
        } return -1;
    }

    /**
     * Removes an element from the MyArrayList.
     * @param index position that should be deleted
     * @throws IndexOutOfBoundsException if the given index is invalid
     */
    @SuppressWarnings("unchecked")
    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        if (index >= this.getCapacity()) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds.");
        // Removal is realized by setting the element to remove to 'null'
        // and then copying the internal array into a new array
        // to shift all elements one index position "to the left"
        } else if (index == 0) {
            // If index == 0, the whole array from index 1 onwards is copied
            int size = this.getSize() - 1;
            this.list[index] = null;
            Object[] tempArray = new Object[this.getSize()];
            System.arraycopy(this.list, 1, tempArray, 0, size);
            this.list = (E[]) tempArray;
        } else {
            // If index >0, copying is done in two steps
            // First, the array until the element-to-remove is copied
            // Afterwards, the elements from index + 1 are copied.
            this.list[index] = null;
            Object[] tempArray = new Object[this.getSize()];
            System.arraycopy(this.list, 0, tempArray, 0, index);
            System.arraycopy(this.list, index + 1, tempArray, index, this.getSize() - index);
            this.list = (E[]) tempArray;
        }
    }

    /**
     * Gets an element from the MyArrayList.
     * @param index the index position of the element to retrieve
     * @return the element of the MyArrayList at the given index position
     * @throws IndexOutOfBoundsException if the given index is invalid
     */
    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if (index > this.getCapacity() - 1) {
            throw new IndexOutOfBoundsException("invalid index position " + index);
        } else {
            return (E) this.list[index];
        }
    }

    /**
     * Returns the size of the internal array of the MyArrayList.
     * Should always be the same size as getCapacity().
     * @return the length of the array
     */
    @Override
    public int getInternalLength() {
        return this.list.length;
    }

    /**
     * Clears the internal array and sets the capacity back to the initial value.
     */
    @SuppressWarnings("unchecked")
    @Override
    public void clear() {
        this.list = (E[]) new Object[capacity];
    }

    /**
     * Returns the textual representation of all objects in the MyArrayList.
     * All individual object toString() representations are merged into one String object
     * @return the String representing all objects of the MyArrayList
     */
    public String toString() {
        String returnString = null;
        for (int i = 0; i <= this.getCapacity() - 1; i++) {
            if (returnString != null) {
                returnString = returnString + "," + this.get(i).toString();
            } else {
                returnString = this.get(i).toString();
            } 
        }
        return returnString;
    }

    /**
     * Getter method to get the increment property of the MyArrayList.
     * @return the increment of the MyArrayList
     */
    public int getIncrement() {
        return increment;
    }
}
