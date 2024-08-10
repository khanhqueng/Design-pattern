package Structural.facade;

public class PdfCheck implements ExtensionCheck{
    @Override
    public void check(String fileName) {
        System.out.printf("converting %s to Pdf File%n", fileName);
    }
}
