package comparators;

import java.util.Comparator;

public class CompNatural implements Comparator<SimpleClass> {
    @Override
    public int compare(SimpleClass o1, SimpleClass o2) {
        return o1.compareTo(o2);
    }
}
