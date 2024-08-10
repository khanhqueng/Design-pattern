package Structural.facade;

public class FileConverterFacade {
    private ExtensionCheck extensionCheck;


    public void convert(String fileName, FileExtension extension){
        VideoExtracter videoExtracter= new VideoExtracter();
        videoExtracter.extract();
        switch (extension){
            case DOC -> {extensionCheck= new DocCheck();
                extensionCheck.check(fileName);
                break;
            }
            case PDF -> {
                extensionCheck = new PdfCheck();
                extensionCheck.check(fileName);
                break;
            }
        }
    }
}
