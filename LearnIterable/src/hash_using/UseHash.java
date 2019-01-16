/**
 * Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать, сколько раз встречается каждое слово.
 */

package hash_using;

import java.util.HashMap;

/**
 * Классный алгоритм:
 */


public class UseHash {
    public static void main(String[] args) {
        String[] names = {"Bob", "Bill", "Rikki", "Austin", "Rikki", "Rikki"};

        HashMap<String, Integer> hm = new HashMap<>();

        for(String s: names) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        System.out.println(hm);
    }
}
