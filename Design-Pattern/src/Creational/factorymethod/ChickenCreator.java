package Creational.factorymethod;

public class ChickenCreator extends MeatFactory{

	@Override
	public Meat createMeat() {
		return new Chicken();
	}

}
