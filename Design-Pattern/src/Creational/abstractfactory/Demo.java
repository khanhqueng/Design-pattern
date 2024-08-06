package Creational.abstractfactory;

public class Demo {

	public static void main(String[] args) {
		Clients clients = new Clients(new VictorianFactory());
		clients.order();
	}
}
