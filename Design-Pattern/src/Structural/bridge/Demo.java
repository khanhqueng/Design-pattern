package Structural.bridge;

import Structural.adapter.StockDataAdapter;
import Structural.adapter.StockDataClient;

public class Demo {
    public static void main(String[] args){
        RemoteControl remoteControl= new RemoteControl(new TV(30));
        remoteControl.togglePower();
        remoteControl.volumeDown();
        AdvancedRemote advancedRemote= new AdvancedRemote(new Radio(80));
        advancedRemote.togglePower();
        advancedRemote.mute();
    }
}
