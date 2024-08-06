package Creational.abstractfactory;

public class VictorianTable implements Table {

	@Override
	public String surfaceShape() {
		return "circle";
	}

	@Override
	public void shape() {
		System.out.print("my shape is perfect");
	}

}
