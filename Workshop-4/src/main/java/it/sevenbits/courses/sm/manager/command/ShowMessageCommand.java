package it.sevenbits.courses.sm.manager.command;

import it.sevenbits.courses.sm.manager.command.messageContainer.MessageBuffer;

public class ShowMessageCommand implements INetworkManagerCommand {
    private MessageBuffer messageBuffer;


    public ShowMessageCommand(MessageBuffer messageBuffer) {
        this.messageBuffer = messageBuffer;
    }

    @Override
    public void execute() {
        System.out.println("CURRENT MESSAGE: " + messageBuffer.toString());
        messageBuffer.clear();
    }
}
