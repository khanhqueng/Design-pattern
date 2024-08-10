package Structural.bridge;

public class TV implements Device{
    private boolean enable= false;
    private int volume;

    public TV(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean isEnabled() {
        this.enable = !enable;
        if (enable) {
            System.out.println("Turned on TV");
        } else {
            System.out.println("Turned off TV");
        }
        return enable;
    }

    @Override
    public int getVolume() {

        return volume;
    }

    @Override
    public void setVolume(int percent) {
        this.volume= percent;
    }
}
