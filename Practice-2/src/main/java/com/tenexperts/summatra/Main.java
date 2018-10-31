package com.tenexperts.summatra;

import com.tenexperts.summatra.array.ArraySummaterException;
import com.tenexperts.summatra.array.PairSummater;
import java.util.Random;

/**
 * Main class for showing the work of program
 */
public final class Main {
    /**
     * Main function of application that shows results of work of "array" package elements.
     *
     * @throws ArraySummaterException - if length is not multiply 2
     *
     * @param args - Command line arguments
     *
     */
    public static void main(final String[] args) throws ArraySummaterException {
        PairSummater pairSummater = new PairSummater();
        Random rand = new Random();
        final int masLength = 10;
        int[] mas = new int[masLength];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(masLength);
        }
        System.out.println("Элементы массива: ");
        for (int currentElement : mas) {
            System.out.println(currentElement);
        }
        System.out.println("Наибольшая сумма пары: " + pairSummater.sum(mas));
    }
    /**
     * just to make impossible to create Main instance
     */
    private Main(){}
}
