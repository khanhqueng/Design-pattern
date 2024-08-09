package Behavioral.observer;

public class LoggingAlertListener implements EventListeners{
    @Override
    public void update(String fileName) {
        System.out.println("Logging has listened file changing is "+ fileName);
    }
}
