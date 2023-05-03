package de.throsenheim.gui.locations.status;

public class StatusEvent {
    private final String message;

    public StatusEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
