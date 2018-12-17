package it.sevenbits.practice4.uniquestorage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashSet;

/**
 * This storage is able to contain, add, remove objects. Also it is possible to check, if it has some object.
 *  Has no limited size.
 *
 * @param <T> generic type of the value.
 */
public class UniqueStorage <T> implements IUniqueStorage <T> {
    private static Logger Logger;
    private HashSet<T> storageMap;

    /**
     * UniqueStorage constructor.
     */

    public UniqueStorage() {
        storageMap = new HashSet<>();
        Logger = LoggerFactory.getLogger(UniqueStorage.class);
    }

    /**
     * Method for adding objects to the storage.
     * @param value - added object
     * @return - boolean variable; result, was it added or not.
     */
    @Override
    public boolean add(final T value) {
        if (storageMap.add(value)) {
            Logger.info("An object was put into the storage");
            return true;
        } else {
            Logger.info("An object is already contained in the storage");
            return false;
        }
    }

    /**
     *  Method for removing objects from the storage.
     *
     * @param value - removed object.
     * @return - boolean variable; result, was it removed or not.
     */
    @Override
    public boolean remove(final T value) {
        if (storageMap.remove(value)) {
            Logger.info("Object was deleted from the storage");
            return true;
        } else {
            Logger.error("Object isn't contained in the storage");
            return false;
        }
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
        return storageMap.contains(value);
    }
}
