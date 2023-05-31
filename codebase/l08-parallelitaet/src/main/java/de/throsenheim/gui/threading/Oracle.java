package de.throsenheim.gui.threading;

import java.util.Random;

public class Oracle {
    private Random random = new Random();

    public String ask(String question) {
        return random.nextBoolean() ? "Yes" : "No";
    }
}
