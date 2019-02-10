package it.sevenbits.practiceFive;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    private final static Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static ListOperator listOperator = new ListOperator();
    private static Random random = new Random();
    private final static int listSize = 10;

    public static void main(final String[] args) {
        firstTestingOfListOperator();
        secondTestingOfListOperator();
        multithreadingTest();
    }

    public static void firstTestingOfListOperator() {
        LOGGER.info("First testing of ListOperator has initiated");

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            arrayList.add(random.nextInt(100));
        }

        LOGGER.info("ArrayList<Integers> first state: " + arrayList.toString());
        LOGGER.info("Max element of ArrayList<Integers> in the range from 2 to 7: " +
                listOperator.max(arrayList, 2,7));
        listOperator.changeElementsPosition(arrayList, 2, 7);
        LOGGER.info("ArrayList<Integers> after swapping a numbers: " +
                arrayList.toString());
    }

    public static void secondTestingOfListOperator() {
        LOGGER.info("Second testing of ListOperator has initiated");
        LinkedList<Account> linkedList = new LinkedList<>();
        for (int i = 0; i < listSize; i++) {
            linkedList.add(new Account(random.nextInt(100)));
        }

        LOGGER.info("LinkedList<Account> first state: [");
        for (Account account : linkedList) {
            System.out.print(account.toString());
        }
        System.out.println("]");

        LOGGER.info("Max element of LinkedList<Account> in the range from 2 to 7: " +
                listOperator.max(linkedList, 2,7));
        listOperator.changeElementsPosition(linkedList, 2, 7);
        LOGGER.info("ArrayList<Integers> after swapping a numbers: ");
        for (Account account : linkedList) {
            System.out.print(account.toString());
        }
        System.out.println("]");
    }

    public static void multithreadingTest() {
        LOGGER.info("Multithreading testing has initiated");
        ThreadExecutor threadExecutor = new ThreadExecutor();
        threadExecutor.showAccountFilling(20);
    }

    private Main() {}
}
