package it.sevenbits.practice4.fixedstorage;

import it.sevenbits.practice4.uniquestorage.UniqueStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.Map;

/**
 * This storage is able to contain, add, remove objects. Also it is possible to check, if it has some object.
 * Has a limited size, that we specify in constructor.
 *
 * @param <U> generic type of key of the value.
 * @param <T> generic type of the value.
 */
  public class FixedStorage<U, T> implements IFixedStorage<U, T> {
    private Map<U, T> fixedStorage;
    private long storageSize;
    private static Logger Logger;
    private long currentStorageSize;

    /**
     * Fixedstorage class constructor. Here we definite a size of the storage.
     * @param storageSize - size of the storage
     */
    public FixedStorage(final long storageSize) {
        fixedStorage = new HashMap<>();
        Logger = LoggerFactory.getLogger(UniqueStorage.class);
        this.storageSize = storageSize;
        currentStorageSize = 0;
    }
    /**
     * Method for adding objects to the storage.
     * @param value - added object
     * @param key - key of the object.
     */
    @Override
    public void add(final U key, final T value) {
        if (currentStorageSize == storageSize) {
            Logger.info("Max size of storage was reached. Object was lost!");
            return;
        }

        if (fixedStorage.get(key) == null) {
            Logger.info("Object was contained to the storage");
            fixedStorage.put(key, value);
            currentStorageSize++;
        } else {
            Logger.info("Object with key \"" + key + "\" is already contained in the storage. " +
                    "An old element is replaced by a new one");
            fixedStorage.remove(key);
            fixedStorage.put(key, value);
        }
    }
    /**
     * Method for removing objects to the storage.
     * @param key - key of the object.
     */
    @Override
    public void remove(final U key) {
        if (fixedStorage.get(key) == null) {
            Logger.info("Storage has no object with key \"" + key + "\"");
            return;
        }

        fixedStorage.remove(key);
        Logger.info("Object with this key \"" + key + "\" was removed from the storage");
        currentStorageSize--;
    }

    /**
     * Method for getting an objects by the key.
     *
     * @param key - a key by which we will take the object
     * @return an object, and null if its doesn't exist
     */
    @Override
    public T get(final U key) {
        Logger.info("method get() was called");
        return fixedStorage.get(key);
    }

    /**
     * Method, that make it possible to check, if the storage has some object.
     *
     * @param value - an object we are checking for
     * @return - boolean variable; result, if the storage has an object or no.
     */
    @Override
    public boolean contains(final T value) {
        Logger.info("method contains() was called");
        return fixedStorage.containsKey(value);
    }
}
