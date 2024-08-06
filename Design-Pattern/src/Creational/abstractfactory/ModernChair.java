package Creational.abstractfactory;

public class ModernChair implements Chair {

	@Override
	public int hasLegs() {
		return 2;
	}

	@Override
	public void shape() {
		System.out.print("my shape is modern");
	}

}
