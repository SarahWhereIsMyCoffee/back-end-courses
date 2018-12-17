package it.sevenbits.practice4;

import java.util.UUID;

/**
 * Some class for the testing our storages.
 */
public class Planet {
    private String name;
    private String id;


    /**
     * Planet class constructor
     * @param name - String name of the instance.
     */
    public Planet(final String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    /**
     * Method to get the name of Planet instance.
     *
     * @return string name of the instance.
     */
    public String getName() {
        return name;
    }
    /**
     * Method to get the id of Planet instance.
     *
     * @return string id of the instance.
     */
    public String getId() {
        return id;
    }
}
