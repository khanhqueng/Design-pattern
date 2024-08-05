package Structural.Adapter;

public class StockDataClient {
    private final XML metrics= new XML("300.0$");
    private final IStockClient stockClient;

    public StockDataClient(IStockClient stockClient) {
        this.stockClient = stockClient;
    }
    public void analyze(){
        stockClient.getData(metrics);
    }
}
