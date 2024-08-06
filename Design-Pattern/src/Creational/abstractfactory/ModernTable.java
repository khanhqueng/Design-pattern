package Creational.abstractfactory;

public class ModernTable implements Table {

	@Override
	public String surfaceShape() {
		return "rectangle";
	}

	@Override
	public void shape() {
		System.out.print("my shape is good");
	}

}
