package Creational.abstractfactory;

public class VictorianFactory implements FurnitureFactory{

	@Override
	public Chair createChair() {
		Chair victorianChair = new VictorianChair();
		victorianChair.shape();
		return victorianChair;
	}

	@Override
	public Table createTable() {
		Table vicTable= new VictorianTable();
		vicTable.shape();
		return vicTable;
	}

}
