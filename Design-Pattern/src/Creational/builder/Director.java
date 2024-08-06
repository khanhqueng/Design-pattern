package Creational.builder;

public class Director {
	private final Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}
	void make(String type) {
		builder.reset();
		if(type.equals("Simple")) {
			builder.buildRoof();
		}
		else {
			builder.buildFloor()
				.buildRoof()
				.buildWall();
		}
	}
}
