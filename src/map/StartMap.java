package map;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class StartMap {
    public static void main(String[] args) {
        HashMap<String, Car> hashMap = new HashMap<>();

        hashMap.put("test", new Car("Toyota"));
        hashMap.put("key", new Car("BMW"));
        hashMap.put("niva", new Car("NIVA"));
        hashMap.put("car", new Car("Lexus"));

        iterateMap(hashMap);    // при выводе порядок вставки по ключам не сохраняется

        TreeMap<String, Car> treeMap = new TreeMap<>();

        treeMap.put("test", new Car("Toyota"));
        treeMap.put("key", new Car("BMW"));
        treeMap.put("niva", new Car("Lexus"));
        treeMap.put("car", new Car("Niva"));

        iterateMap(treeMap);    // сортировка по ключам (в алфавитном порядке)

        LinkedHashMap<String, Car> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("test", new Car("toyota"));
        linkedHashMap.put("key", new Car("BMW"));
        linkedHashMap.put("niva", new Car("NIVA"));
        linkedHashMap.put("car", new Car("Lexus"));

        iterateMap(linkedHashMap);  // вывод в порядке вставки

        System.out.println("higherKey = " + treeMap.higherKey("key"));
        System.out.println("lowerEntry = " + treeMap.higherEntry("key"));
    }

    private static void iterateMap(Map map) {
        System.out.println();

        Iterator<Map.Entry<String, Car>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Car> carEntry = iterator.next();
            System.out.println(carEntry.getKey() + " - " + carEntry.getValue());
            // iterator.remove(); // можно удалять элементы после обработки
        }
    }
}
