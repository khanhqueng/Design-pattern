package Creational.abstractfactory;

public class VictorianChair implements Chair {

	@Override
	public int hasLegs() {
		return 4;
	}

	@Override
	public void shape() {
		System.out.print("my shape is old school");
		
	}

}
