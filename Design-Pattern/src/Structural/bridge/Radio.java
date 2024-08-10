package Structural.bridge;

public class Radio implements Device{
    private boolean enable= false;
    private int volume;

    public Radio(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean isEnabled() {

        enable = !enable;
        if (enable) {
            System.out.println("Turned on Radio");
        } else {
            System.out.println("Turned off Radio");
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
