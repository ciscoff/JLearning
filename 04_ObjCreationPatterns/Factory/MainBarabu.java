public class MainBarabu {

    public static void main(String[] args) {
        Barabu barabu = new Barabu("Sergey", 1971);
        barabu.info();

        Barabu b = BarabuFactory.getBarabu(1980);
        if(b != null) b.info();

        b = BarabuFactory.getBarabu(2009);
        if(b != null) b.info();


    }



}