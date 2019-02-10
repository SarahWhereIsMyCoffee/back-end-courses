package it.sevenbits.courses.sm.manager.command;

public class PackageIgnoredCommand implements INetworkManagerCommand {
    @Override
    public void execute() {
        System.out.println("Package ignored");
    }
}
