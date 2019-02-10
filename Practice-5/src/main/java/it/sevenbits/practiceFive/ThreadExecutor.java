package it.sevenbits.practiceFive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadExecutor {
    private final Logger LOGGER = LoggerFactory.getLogger(ThreadExecutor.class);

    public void showAccountFilling(final long millis) {
        final int threadAddingValues[] = {10, -6, 3};
        LOGGER.info("ShowAccountFilling method was execute");
        final Account account = new Account(0);

        Thread firstThread = new Thread(() -> {
            LOGGER.info(Thread.currentThread().getName() + " was interrupted");
            try {
                while (!Thread.interrupted()) {
                    account.addToBalance(threadAddingValues[0]);
                    Thread.yield();
                    LOGGER.info("Current balance: " + account.toString() + " (" + Thread.currentThread().getName() + ")");
                }
            } catch (Exception e) {
                LOGGER.info(Thread.currentThread().getName() + " was interrupted during one of the iterations");
                return;
            }
        });

        Thread secondThread = new Thread(() -> {
            LOGGER.info(Thread.currentThread().getName() + " was interrupted");
            try {
                while (!Thread.interrupted()) {
                    account.addToBalance(threadAddingValues[1]);
                    Thread.yield();
                    LOGGER.info("Current balance: " + account.toString() + " (" + Thread.currentThread().getName() + ")");
                }
            } catch (Exception e) {
                LOGGER.info(Thread.currentThread().getName() + " was interrupted during one of the iterations");
                return;
            }
        });

        Thread thirdThread = new Thread(() -> {
            LOGGER.info(Thread.currentThread().getName() + " was interrupted");
            try {
                while (!Thread.interrupted()) {
                    account.addToBalance(threadAddingValues[2]);
                    Thread.yield();
                    LOGGER.info("Current balance: " + account.toString() + " (" + Thread.currentThread().getName() + ")");
                }
            } catch (Exception e) {
                LOGGER.info(Thread.currentThread().getName() + " was interrupted during one of the iterations");
                return;
            }
        });

        firstThread.start();
        secondThread.start();
        thirdThread.start();

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        firstThread.interrupt();
        secondThread.interrupt();
        thirdThread.interrupt();

        try {
            firstThread.join();
            secondThread.join();
            thirdThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LOGGER.info("Account balance: " + account.toString());
    }
}
