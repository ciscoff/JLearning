import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {


        // HighOrder ----------------------------------------------------------
        
        HighOrder ho = new HighOrder();

        FunctionalInterfaces.PrintInUp piu = s -> System.out.println(s.toUpperCase());
        FunctionalInterfaces.PrintInLow pil = s -> System.out.println(s.toLowerCase());

        System.out.println("Print raw List");
        ho.printRaw();

        System.out.println("Print Upper Case");        
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        ho.printUpperCase(consumer);

        System.out.println("Print Lower Case");                
        ho.printLowerCase(pil);


        // StreamEdu ----------------------------------------------------------

        System.out.println("Stream elements with length > 3");                        
        StreamEdu se = new StreamEdu();
        System.out.println("" + se.streamToCount() + "\n");

        System.out.println("Print converted stream");                        
        List<Integer> li = se.streamToList();
        li.forEach(n -> System.out.println(n));

    }
}