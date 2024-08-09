package Behavioral.state;

public class ReadyState extends State{

    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public void clickLock() {
        player.changeState(new LockedState(player));
    }

    @Override
    public void clickPlay() {
        player.changeState(new PlayingState(player));
        System.out.println("State: Ready moved to Play State");
    }

    @Override
    public void clickNext() {
        System.out.println("Still Ready State but next song");
    }
}
