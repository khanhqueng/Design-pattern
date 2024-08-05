package Behavioral.template;

public interface DataMiner {
    default void mine(String path){
        openFile(path);
        extractData(path);
        closeFile(path);
    }

    void closeFile(String path);

    void extractData(String path);

    void openFile(String path);
}
