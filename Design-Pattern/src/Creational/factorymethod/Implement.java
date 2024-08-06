package Creational.factorymethod;

public class Implement {

	public static void main(String[] args) {
		MeatFactory beef= new BeefCreator();
		beef.orderMeat();
		MeatFactory chicken= new ChickenCreator();
		chicken.orderMeat();
	}

}
