package Structural.adapter;

public class StockDataAdapter implements IStockClient{
    private AnalyticsLibrary analyticsLibrary;

    private JSON convertXMLToJSON(XML xml){
        JSON json= new JSON(xml.getData());
        return json;
    }

    @Override
    public void getData(XML xml) {
        JSON convertedData= convertXMLToJSON(xml);
        analyticsLibrary= new AnalyticsLibrary();
        analyticsLibrary.analyzeData(convertedData);
    }
}
