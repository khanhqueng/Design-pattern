package Behavioral.observer;

public class EmailAlertListener implements EventListeners{
    @Override
    public void update(String fileName) {
        System.out.println("Email has listened file changing is "+ fileName);
    }
}
