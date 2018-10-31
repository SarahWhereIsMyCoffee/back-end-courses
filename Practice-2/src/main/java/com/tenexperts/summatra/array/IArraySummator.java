package com.tenexperts.summatra.array;
/**
 * The Main interface, which implemented by PairSummater and SimpleSummater classes
 * contains the only one method 'sum'
 */
public interface IArraySummator {
    /**
     * function gets some massive fielded by integers
     * returns integer value
     * contains ArraySummaterException
     *
     * @param mas - integer massive
     *
     * @throws ArraySummaterException - some exception, contains message method (exception)
     *
     * @return - function returns some integer value
     */
    int sum(int[] mas) throws ArraySummaterException;
}
