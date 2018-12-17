package it.sevenbits.practice4.uniquestorage;

/**
 * This storage is able to contain, add, remove objects. Also it is possible to check, if it has some object.
 *  Has no limited size.
 *
 * @param <T> generic type of the value.
 */
public interface IUniqueStorage <T> {
    /**
     * Method for adding objects to the storage.
     * @param value - added object
     * @return - boolean variable; result, was it added or not.
     */
    boolean add(T value);
    /**
     *  Method for removing objects from the storage.
     *
     * @param value - removed object.
     * @return - boolean variable; result, was it removed or not.
     */
    boolean remove(T value);
    /**
     * Method, that make it possible to check, if the storage has some object.
     *
     * @param value - an object we are checking for
     * @return - boolean variable; result, if the storage has an object or no.
     */
    boolean contains(T value);
}
