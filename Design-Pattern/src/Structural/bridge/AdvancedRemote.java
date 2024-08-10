package Structural.bridge;

public class AdvancedRemote extends RemoteControl{
    public AdvancedRemote(Device device) {
        super(device);
    }
    void mute(){
        device.setVolume(0);
        System.out.println("Volume is "+ device.getVolume());
    }
}
