package Structural.adapter;

public class XML {
    private String data;

    public XML(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "XML{" +
                "data='" + data + '\'' +
                '}';
    }

    public String getData() {
        return data;
    }
}
