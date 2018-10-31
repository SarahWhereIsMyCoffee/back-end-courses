package com.tenexperts.summatra.array;

/**
 * ArraySummaterException is used by PairSummater and SimpleSummater classes
 * contains message method
 */
public class ArraySummaterException extends Exception {
    /**
     * function shows to users whats the problem; gets string in param's
     *
     * @param message - string, that function gets if exception is on
     */
    public ArraySummaterException(final String message) {
        super(message);
    }
}
