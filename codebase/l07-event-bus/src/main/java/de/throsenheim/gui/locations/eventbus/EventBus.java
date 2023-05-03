package de.throsenheim.gui.locations.eventbus;

public interface EventBus {

    void publish(Object event);

    void subscribe(Class eventClass, EventBusListener listener);
}
