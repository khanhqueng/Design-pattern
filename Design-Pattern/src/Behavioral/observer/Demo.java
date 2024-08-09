package Behavioral.observer;

public class Demo {
    public static void main(String[] args){
        Editor editor= new Editor(new EventManager());
        editor.openFile();
        editor.saveFile();
    }
}
