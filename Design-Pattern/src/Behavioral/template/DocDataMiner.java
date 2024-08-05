package Behavioral.template;

public class DocDataMiner implements DataMiner {
    @Override
    public void closeFile(String path) {
        System.out.println("Close Doc file");
    }

    @Override
    public void extractData(String path) {
        System.out.println("Extract Doc file");
    }

    @Override
    public void openFile(String path) {
        System.out.println("Open Doc file");
    }
}
