package it.sevenbits.practice4.fixedstorage;

/**
 * This storage is able to contain, add, remove objects. Also it is possible to check, if it has some object.
 * Has a limited size, that we specify in constructor.
 *
 * @param <U> generic type of key of the value.
 * @param <T> generic type of the value.
 */
public interface IFixedStorage <U, T> {
    /**
     * Method for adding objects to the storage.
     * @param value - added object
     * @param key - key of the object.
     */
    void add(U key, T value);
    /**
     * Method for removing objects to the storage.
     * @param key - key of the object.
     */
    void remove(U key);

    /**
     * Method for getting an objects by the key.
     *
     * @param key - a key by which we will take the object
     * @return an object, and null if its doesn't exist
     */
    T get(U key);
    /**
     * Method, that make it possible to check, if the storage has some object.
     *
     * @param value - an object we are checking for
     * @return - boolean variable; result, if the storage has an object or no.
     */
    boolean contains(T value);
}
