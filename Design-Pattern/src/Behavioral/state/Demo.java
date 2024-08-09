package Behavioral.state;

import Behavioral.observer.Editor;
import Behavioral.observer.EventManager;

public class Demo {
    public static void main(String[] args){
        Player player= new Player();
        player.clickNext();
        // cant play because in ready state
        player.nextSong();
        player.clickPlay();
        // now can play
        player.nextSong();
        player.clickLock();
        player.clickLock();
    }
}
