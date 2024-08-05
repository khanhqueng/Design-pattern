package Structural.Adapter;

public class JSON {
    private String data;

    public JSON(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JSON{" +
                "data='" + data + '\'' +
                '}';
    }

    public String getData() {
        return data;
    }
}
