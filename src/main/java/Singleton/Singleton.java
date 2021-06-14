package Singleton;

public class Singleton {
    private static Singleton order;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getOrder(String value) {
        if (order == null) {
            order = new Singleton(value);
        }
        return order;
    }
}
