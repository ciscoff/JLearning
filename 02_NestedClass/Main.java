public class Main {
    public static void main(String[] args) {
        OuterClass.NestedClass nc = new OuterClass.NestedClass();

        System.out.println("OuterClass ID = " + nc.readParentID());
    }
}