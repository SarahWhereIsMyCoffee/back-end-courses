package it.sevenbits.courses.sm.manager.command.factory;

/**
 * This exception is used by {@link ILexerFactory} interface and classes that implement it.
 */
public class CommandFactoryException extends Exception {
    /**
     * Class constructor with specifying of an error message.
     *
     * @param message {@link String} instance that will be contained in the thrown instance of exception.
     */
    public CommandFactoryException(final String message) {
        super(message);
    }

    /**
     * Class constructor with specifying of an error message and {@link Throwable} cause of exception throwing.
     *
     * @param message {@link String} instance that will be contained in the thrown instance of exception.
     * @param cause An instance of {@link Throwable} that caused the situation in which exception was thrown.
     */
    public CommandFactoryException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
