/**
 * Interface for the MyArrayList Implementation.
 * 
 * @author OMI-Team
 * 
 *
 * @param <E>
 */
public interface MyArrayListInterface<E> {
    /**
     * Get the current capacity of the ArrayList.
     * 
     * @return the current capacity
     */
    int getCapacity();

    /**
     * Get the number of elements.
     * 
     * @return number of elements.
     */
    int getSize();

    /**
     * Add one element at the last index.
     * 
     * @param e
     *            element to add.
     */
    void add(E e);

    /**
     * Removes an element at the index.
     * 
     * @param index
     *            position that should be deleted.
     * @throws IndexOutOfBoundsException
     *             Index is not in the bounds.
     */
    void remove(int index) throws IndexOutOfBoundsException;

    /**
     * Get the element at the index.
     * 
     * @param index
     *            position
     * @return Element at the index.
     * @throws IndexOutOfBoundsException
     *             Index is not in the bounds.
     */
    E get(int index) throws IndexOutOfBoundsException;

    /**
     * Get the size of the internal Array.
     * 
     * @return size of internal array.
     */
    int getInternalLength();

    /**
     * Display the ArrayList as a string. The format is: a,b,c,d,e,...
     * 
     * @return String
     */
    String toString();

    /**
     * Clears the ArrayList. Removes all elements and set the capacity back to
     * its initial value.
     */
    void clear();

}
