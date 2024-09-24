package Behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ControlTower mediator= new ControlTower();
        Airplane airplane= new Airplane();
        Helicopter helicopter= new Helicopter();
        Plane plane= new Plane();
        mediator.registerComponent(airplane);
        mediator.registerComponent(helicopter);
        mediator.registerComponent(plane);
        airplane.land();
        helicopter.end();
        System.out.println(helicopter.getLane());
        plane.changeLane();
    }
}
