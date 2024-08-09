package Behavioral.state;

public class LockedState extends State{

    public LockedState(Player player) {
        super(player);
    }

    @Override
    public void clickLock() {
        System.out.println("Unlocked audio player");
    }

    @Override
    public void clickPlay() {
        player.changeState(new PlayingState(player));
    }

    @Override
    public void clickNext() {
        player.changeState(new ReadyState(player));
    }
}
