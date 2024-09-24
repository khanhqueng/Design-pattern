package Behavioral.mediator;

import javax.print.attribute.standard.Media;

public class Airplane extends Component{
    private String lane;



    public void start(){
        mediator.notifyComponent(this, "start");
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

}
