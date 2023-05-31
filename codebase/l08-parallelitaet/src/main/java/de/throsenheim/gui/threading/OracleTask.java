package de.throsenheim.gui.threading;

import javafx.concurrent.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class OracleTask extends Task<Boolean> {
    private static final Logger LOGGER = LoggerFactory.getLogger(OracleTask.class);

    @Override
    protected Boolean call() throws Exception {
        LOGGER.info("Call in thread {}", Thread.currentThread());

        for (int i = 0; i < 10; i++) {
            updateProgress(i, 10);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return new Random().nextBoolean();
    }
}
