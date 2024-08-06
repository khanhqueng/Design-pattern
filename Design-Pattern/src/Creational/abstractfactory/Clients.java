package Creational.abstractfactory;


public class Clients {
	private final FurnitureFactory factory;
	
	public Clients(FurnitureFactory furnitureFactory) {
		this.factory= furnitureFactory;
	}
	public void order() {
		factory.createChair();
		factory.createTable();
	}
}
