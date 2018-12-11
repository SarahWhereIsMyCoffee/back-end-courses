package it.sevenbits.courses.sm.manager.sm;

import it.sevenbits.courses.sm.log.MessageFormatter;
import it.sevenbits.courses.sm.manager.INetworkManager;
import it.sevenbits.courses.sm.manager.NetworkManagerException;
import it.sevenbits.courses.sm.network.INetwork;
import it.sevenbits.courses.sm.network.NetworkPackage;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class StateMachineNetworkManager implements INetworkManager {
    private static final Logger Logger = LoggerFactory.getLogger(StateMachineNetworkManager.class);
    private MessageFormatter messageFormatter = new MessageFormatter();
    private boolean isInterrupted = false;
    private final long TIMEOUT = 500;
    private final StateTransition stateTransition;

    public StateMachineNetworkManager() {
        this.stateTransition = new StateTransition();
    }

    @Override
    public void listen(INetwork network) throws NetworkManagerException {
        State currentState = stateTransition.getStartState();
        try {
            while(!isInterrupted) {
                while(network.hasPackage()) {
                    NetworkPackage currentPackage = network.getPackage();
                    Logger.info(String.format(
                            messageFormatter.getStringFormatByType(currentPackage.getType()), currentPackage.getMessage()
                    ));

                    currentState = stateTransition.nextState(currentState, currentPackage);
                    System.out.println(String.format("%1$s: %2$s", currentPackage.getType(), currentState.toString()));
                }

                Thread.sleep(TIMEOUT);
            }
        } catch (InterruptedException e) {
            String errorMessage = "Network manager was interrupted unexpectedly";
            Logger.error(errorMessage);
            throw new NetworkManagerException(errorMessage, e);
        }
    }

    @Override
    public void stop() {
        Logger.info("Network manager was interrupted");
        isInterrupted = true;
    }
}
