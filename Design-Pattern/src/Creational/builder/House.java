package Creational.builder;

public class House {
	private String roof;
	private String floor;
	private String wall;
	public String getRoof() {
		return roof;
	}
	public void setRoof(String roof) {
		this.roof = roof;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getWall() {
		return wall;
	}
	public void setWall(String wall) {
		this.wall = wall;
	}
	@Override
	public String toString() {
		return "House [roof=" + roof + ", floor=" + floor + ", wall=" + wall + "]";
	}
	
	
	
	
}
