package Behavioral.observer;

public class Editor {
    private final EventManager eventManager;

    public Editor(EventManager eventManager) {
        this.eventManager = eventManager;
    }
    public void openFile(){
        eventManager.subscribe("OPEN", new LoggingAlertListener());
        eventManager.notify("OPEN", "khanh.txt");
    }
    public void saveFile(){
        eventManager.subscribe("SAVE", new EmailAlertListener());
        eventManager.notify("SAVE", "khanh.txt");
    }

}
