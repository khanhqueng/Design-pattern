package Structural.bridge;

public class RemoteControl {
    protected   Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    void togglePower(){
        device.isEnabled();
    }
    void volumeDown(){
        device.setVolume(device.getVolume()-1);
        System.out.println("Volume  is "+ device.getVolume());
    }
}
