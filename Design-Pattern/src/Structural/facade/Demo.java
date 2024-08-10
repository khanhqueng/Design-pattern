package Structural.facade;

public class Demo {
    public static void main(String[] args){
        // Without facade
        VideoExtracter videoExtracter= new VideoExtracter();
        videoExtracter.extract();
        ExtensionCheck extensionCheck= new PdfCheck();
        extensionCheck.check("Khanh.txt");

        // With facade
        FileConverterFacade facade= new FileConverterFacade();
        facade.convert("Khanh.txt", FileExtension.PDF);
    }
}
