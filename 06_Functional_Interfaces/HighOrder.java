/**
 * Материалы:
 * https://metanit.com/java/tutorial/9.3.php
 * http://developer.alexanderklimov.ru/android/java/arraylist.php
 * http://tutorials.jenkov.com/java-functional-programming/higher-order-functions.html
 * https://www.baeldung.com/java-8-lambda-expressions-tips
 */

import java.util.List;
import java.util.ArrayList;
import java.util.function.*;

public class HighOrder {


    List<String> li = new ArrayList<>();


    public HighOrder() {
        li.add("My");
        li.add("Name");
        li.add("is");
        li.add("Sergey");
    }

    /**
     * Print raw list
     */
    public void printRaw() {
        li.forEach(s -> System.out.println(s));
        rowTab();
    }

    /**
     * Print list in upper case 
     */
    public void printUpperCase(Consumer<String> consumer) {
        /*
        https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
        void forEach(Consumer<? super T> action)
        */
        li.forEach(consumer);
        rowTab();
    }

    /**
     * Print list in lower case
     */
    public void printLowerCase(FunctionalInterfaces.PrintInLow pil) {
        for (String s: li) pil.op(s);
        rowTab();        
    }


    /**
     * Utilities
     */
    private void rowTab() {
        System.out.println("\n");                
    }

}