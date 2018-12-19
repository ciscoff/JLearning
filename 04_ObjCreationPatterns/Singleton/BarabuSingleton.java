public class BarabuSingleton {
    private BarabuSingleton() {
    }

    private final static BarabuSingleton bs = new BarabuSingleton();

    public static BarabuSingleton getInstance() {
        return bs;
    }
}