package Creational.abstractfactory;

public class ModernFactory implements FurnitureFactory{

	@Override
	public Chair createChair() {
		Chair modernChair = new ModernChair();
		modernChair.shape();
		return modernChair;
	}

	@Override
	public Table createTable() {
		Table modernTable= new ModernTable();
		modernTable.shape();
		return modernTable;
	}

}
