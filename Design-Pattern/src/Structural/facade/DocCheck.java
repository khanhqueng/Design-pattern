package Structural.facade;

public class DocCheck implements ExtensionCheck{
    @Override
    public void check(String fileName) {

           System.out.printf("converting %s to Doc File%n", fileName);
    }
}
