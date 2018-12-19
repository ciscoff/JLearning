public class MainBarabuSingleton {
    public static void main(String[] args) {
        BarabuSingleton bs1 = BarabuSingleton.getInstance();
        BarabuSingleton bs2 = BarabuSingleton.getInstance();

        System.out.println("Compare two Singletones");
        System.out.println("bs1 == bs2 is " + (bs1 == bs2));
    }
}