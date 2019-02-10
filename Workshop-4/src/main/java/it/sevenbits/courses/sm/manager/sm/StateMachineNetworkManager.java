package it.sevenbits.courses.sm.manager.sm;

import it.sevenbits.courses.sm.log.MessageFormatter;
import it.sevenbits.courses.sm.manager.INetworkManager;
import it.sevenbits.courses.sm.manager.NetworkManagerException;
import it.sevenbits.courses.sm.manager.command.INetworkManagerCommand;
import it.sevenbits.courses.sm.manager.command.factory.CommandFactory;
import it.sevenbits.courses.sm.manager.command.messageContainer.ArgsBuffer;
import it.sevenbits.courses.sm.manager.command.messageContainer.MessageBuffer;
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

    private INetworkManagerCommand command;
    private final ArgsBuffer argsBuffer = new ArgsBuffer();
    private MessageBuffer messageBuffer = new MessageBuffer();
    private final CommandFactory commandFactory = new CommandFactory(argsBuffer, messageBuffer);

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

                    argsBuffer.setMessage(currentPackage.getMessage());

                    command = commandFactory.createCommand(currentState, currentPackage.getType());
                    command.execute();

                    currentState = stateTransition.nextState(currentState, currentPackage);
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
