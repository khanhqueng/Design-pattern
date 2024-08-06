package Creational.builder;

public class Client {
	
	public static void main(String[] args) {
		BrickHouseBuilder brickBuilder= new BrickHouseBuilder();
		Director director= new Director(brickBuilder);
		director.make("nah");
		House house= brickBuilder.getHouse();
		
		System.out.print(house);
	}

}
