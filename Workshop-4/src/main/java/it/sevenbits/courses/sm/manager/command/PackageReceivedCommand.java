package it.sevenbits.courses.sm.manager.command;

import it.sevenbits.courses.sm.manager.command.messageContainer.ArgsBuffer;
import it.sevenbits.courses.sm.manager.command.messageContainer.MessageBuffer;

public class PackageReceivedCommand implements INetworkManagerCommand {
    private ArgsBuffer argsBuffer;
    private MessageBuffer messageBuffer;


    public PackageReceivedCommand(ArgsBuffer argsBuffer, MessageBuffer messageBuffer) {
        this.argsBuffer = argsBuffer;
        this.messageBuffer = messageBuffer;
    }
    @Override
    public void execute() {
        messageBuffer.append(argsBuffer.getMessage());
        System.out.println("Package received");
    }
}
