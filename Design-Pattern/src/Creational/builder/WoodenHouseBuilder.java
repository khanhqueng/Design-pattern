package Creational.builder;

public class WoodenHouseBuilder implements Builder{
	private House house;
	@Override
	public Builder reset() {
		house= new House();
		return this;
	}

	@Override
	public Builder buildRoof() {
		house.setRoof("Wooden");
		return this;
	}

	@Override
	public Builder buildFloor() {
		house.setFloor("Leaf");
		return this;
	}

	@Override
	public Builder buildWall() {
		house.setWall("Wooden");
		return this;
	}

	public House getHouse() {
		return house;
	
	}


	

}
