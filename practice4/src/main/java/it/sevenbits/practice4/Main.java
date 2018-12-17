package it.sevenbits.practice4;

import it.sevenbits.practice4.fixedstorage.FixedStorage;
import it.sevenbits.practice4.fixedstorage.IFixedStorage;
import it.sevenbits.practice4.uniquestorage.IUniqueStorage;
import it.sevenbits.practice4.uniquestorage.UniqueStorage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main class, where we can see the results of the program.
 */
public final class Main {
    private static final Logger Logger = LoggerFactory.getLogger(Main.class);
    private static short fixedStorageSize = 6;
    /**
     * Main method for showing the UniqueStorage and Fixed storage work.
     *
     * @param args - string arguments
     */
    public static void main(final String[] args) {
        Planet planets[] = new Planet[] {
                new Planet("Mercury"),
                new Planet("Venus"),
                new Planet("Earth"),
                new Planet("Mars"),
                new Planet("Jupiter"),
                new Planet("Saturn"),
                new Planet("Uranus"),
        };
        IUniqueStorage<Planet> uniqueStorage = new UniqueStorage<>();

        for (Planet currentPlanet : planets) {
            uniqueStorage.add(currentPlanet);
        }
        uniqueStorage.remove(planets[0]);
        boolean ifContains = uniqueStorage.contains(planets[0]);
        Logger.info("Does uniqueStorage contains an object with name " + planets[0].getName() + "? " + ifContains);
        System.out.println();


        IFixedStorage<String, Planet> fixedStorage = new FixedStorage<>(fixedStorageSize);
        fixedStorage.add("Mercury", new Planet("Mercury"));
        fixedStorage.add("Venus", new Planet("Venus"));
        fixedStorage.add("Earth", new Planet("Earth"));
        fixedStorage.add("Mars", new Planet("Mars"));
        fixedStorage.add("Jupiter", new Planet("Jupiter"));
        fixedStorage.add("Saturn", new Planet("Saturn"));
        fixedStorage.add("Uranus", new Planet("Uranus"));
        fixedStorage.remove("Saturn");
        fixedStorage.remove("Uranus");
        Planet planet = fixedStorage.get("Mercury");
        System.out.println(planet.getName());
    }
    private Main() {}
}
