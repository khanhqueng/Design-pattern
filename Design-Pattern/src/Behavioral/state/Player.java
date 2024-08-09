package Behavioral.state;

public class Player {
    private State state;
    public Player(){
        this.state= new ReadyState(this);
    }
    public void changeState(State state){
        this.state= state;
    }
    void clickLock(){
        state.clickLock();
    }
    void clickPlay(){
        state.clickPlay();
    }
    void clickNext(){
        state.clickNext();
    }
    void nextSong(){
        if(state instanceof PlayingState){
            state.clickNext();
        }
    }
}
