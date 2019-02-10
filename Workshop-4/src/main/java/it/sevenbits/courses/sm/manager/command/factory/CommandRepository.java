package it.sevenbits.courses.sm.manager.command.factory;

import it.sevenbits.courses.sm.manager.command.*;
import it.sevenbits.courses.sm.manager.command.messageContainer.ArgsBuffer;
import it.sevenbits.courses.sm.manager.command.messageContainer.MessageBuffer;
import it.sevenbits.courses.sm.manager.sm.Pair;
import it.sevenbits.courses.sm.manager.sm.State;

import java.util.HashMap;
import java.util.Map;

public class CommandRepository {
    private INetworkManagerCommand packageReceivedCommand;
    private INetworkManagerCommand trashIgnoredCommand;
    private INetworkManagerCommand showMessageCommand;
    private INetworkManagerCommand packageIgnoredCommand;

    private final State defaultState = new State("IGNORE");
    private final State listenState = new State("LISTEN");
    private final State stubSuspicion = new State("TRASH_SUSPICION");

    private Map<Pair<State, String>, INetworkManagerCommand> commandMap;

    public CommandRepository(ArgsBuffer argsBuffer, MessageBuffer messageBuffer) {
        packageReceivedCommand = new PackageReceivedCommand(argsBuffer, messageBuffer);
        trashIgnoredCommand = new TrashIgnoredCommand();
        showMessageCommand = new ShowMessageCommand(messageBuffer);
        packageIgnoredCommand = new PackageIgnoredCommand();

        commandMap = new HashMap<>();

        commandMap.put(new Pair<>(defaultState, "MESSAGE"), packageIgnoredCommand);
        commandMap.put(new Pair<>(defaultState, "TRASH"), trashIgnoredCommand);
        commandMap.put(new Pair<>(defaultState, "MESSAGE_FINISH"), packageIgnoredCommand);
        commandMap.put(new Pair<>(defaultState, "MESSAGE_START"), packageReceivedCommand);

        commandMap.put(new Pair<>(listenState, "MESSAGE"), packageReceivedCommand);
        commandMap.put(new Pair<>(listenState, "TRASH"), trashIgnoredCommand);
        commandMap.put(new Pair<>(listenState, "MESSAGE_FINISH"), showMessageCommand);
        commandMap.put(new Pair<>(listenState, "MESSAGE_START"), packageIgnoredCommand);

        commandMap.put(new Pair<>(stubSuspicion, "MESSAGE"), packageReceivedCommand);
        commandMap.put(new Pair<>(stubSuspicion, "TRASH"), showMessageCommand);
        commandMap.put(new Pair<>(stubSuspicion, "MESSAGE_FINISH"), showMessageCommand);
        commandMap.put(new Pair<>(stubSuspicion, "MESSAGE_START"), packageIgnoredCommand);
    }


    public INetworkManagerCommand getCommand(State state, String string) {
        return commandMap.getOrDefault(new Pair<>(state, string), packageIgnoredCommand);
    }

}
