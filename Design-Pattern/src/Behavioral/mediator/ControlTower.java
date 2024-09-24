package Behavioral.mediator;


public class ControlTower implements Mediator {
    private Airplane airplane;
    private Helicopter helicopter;
    private Plane plane;

    public void registerComponent(Component component){
        component.setMediator(this);
        if (component instanceof Airplane)
            airplane= (Airplane) component;
        if (component instanceof Helicopter)
            helicopter= (Helicopter) component;
        if (component instanceof Plane)
            plane= (Plane) component;
    }
    @Override
    public void notifyComponent(Component sender, String event) {
        if(sender instanceof Airplane){
            reactAirplane(event);
            System.out.println("event: "+ event);
        }
        if(sender instanceof Helicopter){
            reactHelicopter(event);
            System.out.println("event: "+ event);
        }
        if(sender instanceof Plane){
            reactPlane(event);
            System.out.println("event: "+ event);
        }
    }
    private void reactAirplane(String event){
        System.out.println("Air-Plane want to ");
        if(event.equals("land")) helicopter.setLane("K20");
    }
    private void reactHelicopter(String event){
        System.out.println("Helicopter want to ");
    }
    private void reactPlane(String event){
        System.out.println("Plane want to ");
    }
}
