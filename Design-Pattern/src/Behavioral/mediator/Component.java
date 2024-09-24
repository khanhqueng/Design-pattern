package Behavioral.mediator;

public abstract class Component {
    protected Mediator mediator;

    protected void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public void land(){
        mediator.notifyComponent(this,"land");
    }
    public void changeLane(){
        mediator.notifyComponent(this,"change lane");
    }

}
