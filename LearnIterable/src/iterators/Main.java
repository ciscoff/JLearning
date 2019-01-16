package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        /**
         * Работаем с собственным классом
         */
        Counter counter = new Counter(20);

        for (Integer i : counter) {
            System.out.println("Next is " + i);
        }

        counter.forEach(n -> System.out.println(n));

        /**
         * Работаем с коллекцией
         */
        List<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");

        al.forEach(s -> System.out.println(s));


    }
}


class Counter implements Iterable<Integer> {

    private int capacity;
    private int i;

    public Counter(int capacity) {
        this.capacity = capacity;
        this.i = 0;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        for(int n = 0; n < i; n++) action.accept(n);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return i < capacity;
            }

            @Override
            public Integer next() {
                return i++;
            }
        };
    }
}
