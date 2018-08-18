package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class StartSet {
    // самый быстрый
    // not ordered
    // not sorted
    public static void hashSetExample() {
        HashSet<Car> cars = new HashSet<>();

        Car car1 = new Car("Nissan");
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Volvo");
        Car car4 = new Car("Volvo");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        // Проход по коллекции с помощью итератора
        Iterator<Car> iterator = cars.iterator();

        while(iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car.getName());
        }
    }

    // самый медленный
    // sorted
    public static void treeSetExample() {
        TreeSet<Integer> tree = new TreeSet<>();

        tree.add(13);
        tree.add(800);
        tree.add(452);
        tree.add(5678);
        tree.add(987);
        tree.add(8);

        // Проход по коллекции с помощью итератора
        Iterator<Integer> iterator = tree.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    // ordered
    // not sorted
    public static void linkedHashSet() {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(800);
        linkedHashSet.add(1000);
        linkedHashSet.add(234);
        linkedHashSet.add(23523);
        linkedHashSet.add(13);

        // Проход по коллекции с помощью итератора
        Iterator<Integer> iterator = linkedHashSet.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    public static void main(String[] args) {
        hashSetExample();
        treeSetExample();
        linkedHashSet();
    }
}
