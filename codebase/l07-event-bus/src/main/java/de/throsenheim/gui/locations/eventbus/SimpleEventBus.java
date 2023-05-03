package de.throsenheim.gui.locations.eventbus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SimpleEventBus implements EventBus {

    private static final SimpleEventBus INSTANCE = new SimpleEventBus();

    private final HashMap<Class, List<EventBusListener>> subscriptions = new HashMap<>();

    public static SimpleEventBus getEventBus() {
        return INSTANCE;
    }

    private SimpleEventBus() {

    }

    @Override
    public void publish(Object event) {
        if (subscriptions.containsKey(event.getClass())) {
            subscriptions.get(event.getClass()).forEach(eventBusListener -> eventBusListener.handleEvent(event));
        } else {
            throw new IllegalStateException("No subscriber for event of type " + event.getClass());
        }
    }

    @Override
    public void subscribe(Class eventClass, EventBusListener listener) {
        if (!subscriptions.containsKey(eventClass)) {
            subscriptions.put(eventClass, new ArrayList<>());
            subscriptions.get(eventClass).add(listener);
        }
        subscriptions.get(eventClass).add(listener);
    }
}
