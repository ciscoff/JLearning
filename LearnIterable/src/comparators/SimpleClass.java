package comparators;

import java.util.Objects;

public class SimpleClass implements Comparable<SimpleClass> {
    private int id;
    private String name;

    public SimpleClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(SimpleClass o) {
        System.out.println("From compareTo()");
        return this.id - o.getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleClass)) return false;
        SimpleClass that = (SimpleClass) o;
        return getId() == that.getId() &&
                getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    public String toString() {
        return "id= " + id + ", name= " + name;
    }
}
