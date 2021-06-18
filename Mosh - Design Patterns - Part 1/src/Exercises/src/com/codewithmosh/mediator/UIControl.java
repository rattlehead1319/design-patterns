package Exercises.src.com.codewithmosh.mediator;

import java.util.ArrayList;
import java.util.List;

public class UIControl {

    List<EventHandler> eventHandlerList = new ArrayList<>();

    public void attachEventHandler (EventHandler eventHandler) {
        eventHandlerList.add(eventHandler);
    }

    protected void notifyEventHandlers() {
        for (EventHandler eventHandler: eventHandlerList) {
            eventHandler.handle();
        }
    }
}
