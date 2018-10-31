package com.tenexperts.summatra.array;

/**
 * Class for the object that using for find the highest sum
 */
public class PairSummater implements IArraySummator  {
    /**
     * Function to find the highest value of the sum among pairs
     *
     * @param mas - some massive filled by integers; its using in our Main function
     *
     * @return - function returns the highest values of sum among pairs
     *
     * @throws ArraySummaterException -   if the length of mas is not multiply of two, we can not separate a pair
     */
    public int sum(final int[] mas) throws ArraySummaterException     {
        if (mas.length % 2 != 0) {
            throw new ArraySummaterException("Длинна массива не кратна 2!");
        }

        int maxInPairs = 0;
        for (int i = 0; i < mas.length - 1; i += 2) {
            int currentSum = mas[i] + mas[i + 1];
            if (currentSum > maxInPairs) {
                maxInPairs = currentSum;
            }
        }
        return maxInPairs;
    }
}
