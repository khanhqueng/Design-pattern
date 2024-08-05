package Structural.Adapter;


public class Demo {
    public static void main(String[] args){
        StockDataClient stockDataClient= new StockDataClient(new StockDataAdapter());
        stockDataClient.analyze();
    }
}
