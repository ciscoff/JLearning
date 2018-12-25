public class Main {
    public static void main(String[] args) {
        GenException ge = new GenException();

        try {
            System.out.println("Before call");
            ge.generateException();
            System.out.println("After call");        
        }
        catch (Throwable thr) {
            System.out.println("From catch in main");
        }

    }
}


class GenException {

    public void generateException() {

        int[] a = new int[] {100, 200, 300, 400};
        int[] b = new int[] {5, 0, 3, 25};

        try {

            for(int i = 0; i < a.length; i++) {
                System.out.printf("a[i]/b[i] => %d / %d = %d\n", a[i], b[i], a[i] / b[i]);
            }
        }
        //catch (ArithmeticException exception) {
          //  System.out.println("From ArithmeticException");
        //}
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("From ArrayIndexOutOfBoundsException");
        }
        /**
         * Даже если мы не можем обработать исключение в текущем методе, то блок finally будет
         * вызван перед всплытием исключения в вызывающий метод.
         */
        finally {
            System.out.println("From finally");
        }

    }
}