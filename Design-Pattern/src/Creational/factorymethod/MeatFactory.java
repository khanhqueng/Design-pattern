package Creational.factorymethod;

public abstract class MeatFactory {
	public Meat orderMeat() {
		Meat meat= createMeat();
		meat.doStuff();
		return meat;
	}

	public abstract Meat createMeat();
}
