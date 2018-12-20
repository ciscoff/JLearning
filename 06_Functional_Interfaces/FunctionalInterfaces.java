public class FunctionalInterfaces {

    //-------------------------------------------------------------------------
    private interface PrintInCase {
        void op (String arg);
    }

    @FunctionalInterface
    public static interface PrintInUp extends PrintInCase {
        void op (String arg);
    }

    @FunctionalInterface
    public static interface PrintInLow extends PrintInCase {
        void op (String arg);        
    }

    //-------------------------------------------------------------------------
    
    

}