package Behavioral.mediator;

public class Helicopter extends Component{
    private String lane;
    public void end(){
        mediator.notifyComponent(this,"end");
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }
}
