package comparators;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainComparer {
    public static void main(String[] args){


        /**
         * Во первых, помни, что Comparator - это ФУНКЦИОНАЛЬНЫЙ интерфейс (@FunctionalInterface),
         * а значит вместо него можно передавать лямду !!!
         */

        //-------------------------------------------------------------------------

        /**
         * Здесь используем обычный компаратор, сравнивающий по возрастанию, а затем
         * инвертируем его логику методом reversed() - и при этом получает другой
         * компаратор.
         *
         * Важный момент: Set содержит только уникальные элементы, и эта уникальность, как я понял,
         * определяется работой компаратора. Мы помещаем новый элемент и компаратор чекает совпадение
         * этого элемента с уже имеющимися. Если вернется 0, то новый элемент отбрасывается, а старый
         * остается в Set'е. Идем, далее. Так как мы можем сами создать компаратор по какому-то полю,
         * то значения этого поля и станут критерием уникальности инстанса. Это важно понимать.
         *
         * В примере ниже критерием уникальности служит id, так как мы это определили в compareTo();
         */

//        String[] names = {"Bob", "Bill", "Rikki", "Austin", "Mike", "Alice"};
//
//        // Прямая сортировка
//        TreeSet<SimpleClass> ts = new TreeSet<>(new CompNatural());
//        // Обратная сортировка
//        //TreeSet<SimpleClass> ts = new TreeSet<>(new CompNatural().reversed());
//
//        for(int i = 0; i < names.length; i++) {
//            ts.add(new SimpleClass(i + 1000, names[i]));
//        }
//
//        for(SimpleClass sc: ts) {
//            System.out.println(sc);
//        }

        //-------------------------------------------------------------------------

        /**
         * Исследуем варианты использования thenComparing()
         */

        /**
         * Вариант 1.
         * default Comparator<T> thenComparing(Comparator<? super T> thenByComp)
         *
         * Здесь используем два компаратора. Причем второй компаратор "помещаем" в первый.
         * Первый, основной, сравнивает по именам и если они равны, то запускает второй
         * компаратор, который сравнивает по ID. На выходе получаем GROUP BY name )))
         *
         * Кстати, можно использовать три компаратора и более. Главное что все компараторы
         * нужно последовательно добавлять к первому, основному, той же функцией thenComparing()
         *
         * Здесь критерий уникальности "составной" - должны отличаться пары (name, id), потому что
         * мы сравниваем сначала по name, потом по id.
         *
         */
        String[] namesEx = {"Bob", "Bill", "Rikki", "Austin", "Mike", "Alice", "Austin", "Mike", "Alice"};

//        TreeSet<SimpleClass> tsEx = new TreeSet<>(new CompByName().thenComparing(new CompById()));
//        for(int i = 0; i < namesEx.length; i++) {
//            tsEx.add(new SimpleClass(i + 1000, namesEx[i]));
//        }
//
//        for(SimpleClass sc: tsEx) {
//            System.out.println(sc);
//        }


        /**
         * Вариант 2.
         * default <R extends Comparable<? super R> Comparator<T> thenComparing(Function<? super T, ? extends R> getKey)
         *
         * Здесь в первую очередь нужно разобраться что такое Function<? super T, ? extends R> getKey
         *
         * Начнем с простого примера, в котором создаем компаратор на лету статическим методом
         * Comparator.comparing() передавая ему функцию, которая извлекает из сравниваемых объектов то самое поле,
         * по которому их надо сравнивать. В примере мы передаем лямду, которая достает имя, а значит по нему
         * и сравниваем. То есть наш compareTo() в SimpleClass игнорируется.
         *
         * Здесь критерий уникальности только name, поэтому в Set'e окажется только 6 элементов, не смотря на то,
         * что у них разные id.         *
         */
        TreeSet<SimpleClass> tsEx = new TreeSet<>(Comparator.comparing(sc -> sc.getName()));
        for(int i = 0; i < namesEx.length; i++) {
            tsEx.add(new SimpleClass(i + 1000, namesEx[i]));
        }

        for(SimpleClass sc: tsEx) {
            System.out.println(sc);
        }

        /**
         *  Вариант 2.1
         *  Теперь можно разобраться с конструкцией
         *  default <R extends Comparable<? super R> Comparator<T> thenComparing(Function<? super T, ? extends R> getKey)
         *
         */









    }
}
