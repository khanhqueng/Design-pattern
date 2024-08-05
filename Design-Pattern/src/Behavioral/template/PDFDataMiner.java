package Behavioral.template;

public class PDFDataMiner implements DataMiner {
    @Override
    public void closeFile(String path) {
        System.out.println("Close Pdf file");
    }

    @Override
    public void extractData(String path) {
        System.out.println("Extract Pdf file");
    }

    @Override
    public void openFile(String path) {
        System.out.println("Open Pdf file");
    }
}
