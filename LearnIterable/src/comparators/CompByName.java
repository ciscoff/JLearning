package comparators;

import java.util.Comparator;

public class CompByName implements Comparator<SimpleClass> {
    @Override
    public int compare(SimpleClass o1, SimpleClass o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
