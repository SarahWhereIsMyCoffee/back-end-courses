package it.sevenbits.courses.sm.manager.command.factory;

import it.sevenbits.courses.sm.manager.command.INetworkManagerCommand;
import it.sevenbits.courses.sm.manager.command.messageContainer.ArgsBuffer;
import it.sevenbits.courses.sm.manager.command.messageContainer.MessageBuffer;
import it.sevenbits.courses.sm.manager.sm.State;

public class CommandFactory implements ICommandFactory {
    private CommandRepository commandRepository;

    public CommandFactory(ArgsBuffer argsBuffer, MessageBuffer messageBuffer) {
        commandRepository = new CommandRepository(argsBuffer, messageBuffer);
    }

    @Override
    public INetworkManagerCommand createCommand(State state, String string) {
        return commandRepository.getCommand(state, string);
    }
}
