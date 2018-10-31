package com.tenexperts.summatra.array;
/**
 * Class for the object that using to find sum of the mas
 */
public class SimpleSummater implements IArraySummator {
    /**
     * Function to find the highest value of the sum among pairs
     *
     * @param mas - some massive filled by integers; its using in our Main function
     *
     * @return - function returns a value of the massive's sum
     */
    public int sum(final int[] mas) {
        int sum = 0;
        for (int currentChar : mas) {
            sum += currentChar;
        }
        return sum;
    }
}
