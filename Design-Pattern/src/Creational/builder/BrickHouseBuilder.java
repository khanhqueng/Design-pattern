package Creational.builder;

public class BrickHouseBuilder implements Builder{
	private House house;
	@Override
	public Builder reset() {
		house= new House();
		return this;
	}

	@Override
	public Builder buildRoof() {
		house.setRoof("Brick");
		return this;
	}

	@Override
	public Builder buildFloor() {
		house.setFloor("Steel");
		return this;
	}

	@Override
	public Builder buildWall() {
		house.setWall("Brick");
		return this;
	}
	public House getHouse() {
		return house;
	}

	

}
