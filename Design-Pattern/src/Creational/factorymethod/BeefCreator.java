package Creational.factorymethod;

public class BeefCreator extends MeatFactory{

	@Override
	public Meat createMeat() {
		return new Beef();
	}

}
