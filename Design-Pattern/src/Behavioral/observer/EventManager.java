package Behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private final List<EventListeners> listeners= new ArrayList<>();
    public void subscribe(String eventType, EventListeners listener){
        listeners.add(listener);
    }
    public void unsubscribe(String eventType, EventListeners listener){
        listeners.remove(listener);
    }
    public void notify(String eventType, String data){
        System.out.println("Event Type: "+ eventType);
        listeners.forEach(listener ->  listener.update(data));
    }
}
