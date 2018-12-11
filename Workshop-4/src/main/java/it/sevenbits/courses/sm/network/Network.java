package it.sevenbits.courses.sm.network;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Network implements INetwork {
    private final int maxSize;
    private ConcurrentLinkedDeque<NetworkPackage> packages = new ConcurrentLinkedDeque<NetworkPackage>();
    private final static Logger logger = LoggerFactory.getLogger(Network.class);

    public Network(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean hasPackage() {
       return packages.size() > 0;
    }

    @Override
    public NetworkPackage getPackage() {
        String getPackageMessage = "Network.getPackage() method is called";
        logger.info(getPackageMessage);
        return packages.removeFirst();
    }

    @Override
    public void addPackage(String message, String type) {
        if (packages.size() < maxSize) {
            String addPackageMessage = "Network.addPackage() method was called";
            logger.debug(addPackageMessage);
            packages.addLast(new NetworkPackage(type, message));
        }
        String addPackageMessageFall = "Network.addPackage() method error: unable to add package";
        logger.debug(addPackageMessageFall);
    }
}
