package de.throsenheim.gui.threading;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

public class OracleService extends Service<Boolean> {
    @Override
    protected Task<Boolean> createTask() {
        return new OracleTask();
    }
}
