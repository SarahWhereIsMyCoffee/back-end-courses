package it.sevenbits.courses.sm.manager.command;

public class TrashIgnoredCommand implements INetworkManagerCommand {
    @Override
    public void execute() {
        System.out.println("Trash ignored");
    }
}
