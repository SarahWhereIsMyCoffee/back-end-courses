package it.sevenbits.courses.sm.manager.command.factory;

import it.sevenbits.courses.sm.manager.command.INetworkManagerCommand;
import it.sevenbits.courses.sm.manager.sm.State;

import java.lang.reflect.InvocationTargetException;

public interface ICommandFactory {
    INetworkManagerCommand createCommand(State state, String string) throws IllegalAccessException,
            InvocationTargetException,
            InstantiationException,
            CommandFactoryException;
}
