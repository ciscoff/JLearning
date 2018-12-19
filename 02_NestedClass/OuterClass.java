public class OuterClass {
    private final int ID = 1;

    public int n, m;

    public OuterClass(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public static class NestedClass {

        private OuterClass oc;

        public NestedClass() {
            this.oc = new OuterClass(10, 11);
        }

        /**
         * Nested class имеет доступ даже к приватным членам
         * инстанса своего внешнего класса.
         */
        public int readParentID() {
            return oc.ID;
        }

    }
}