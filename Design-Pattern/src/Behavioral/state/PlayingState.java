package Behavioral.state;

public class PlayingState extends State{

    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public void clickLock() {
        player.changeState(new LockedState(player));
    }

    @Override
    public void clickPlay() {
        System.out.println("Play song");
    }

    @Override
    public void clickNext() {
        System.out.println("Next song playing ");
    }
}
