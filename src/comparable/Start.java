package comparable;

import java.util.*;

/*
    Comparable - реализация в том же классе.
    1 критерий сравнения.
    compareTo();

    Comparator - реализация в отдельном классе.
    Несколько типов сравнений.
    compare();
 */
public class Start {
    private static ArrayList<Car> cars = new ArrayList<>();

    public static void print(Collection collection) {
        System.out.println();
        Iterator<Car> iterator = collection.iterator();

        while(iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car.getName() + ", " + car.getYear());
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 1980);
        Car car2 = new Car("Nissan", 1998);
        Car car3 = new Car("Niva", 2005);
        Car car4 = new Car("Yamaha", 2014);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        CarNameComparator carNameComparator = new CarNameComparator();
        CarYearComparator carYearComparator = new CarYearComparator();

        // Сортировка по умолчанию с помощью Comparable.compareTo()
        Collections.sort(cars);
        print(cars);

        // Сортировка по годам с помощью Comparator.compare()
        Collections.sort(cars, carYearComparator);
        print(cars);

        // Сортировка по названию с помощью Comparator.compare()
        Collections.sort(cars, carNameComparator);
        print(cars);

        // Собственную сортировку можно использовать в TreeSet
        TreeSet<Car> carTreeSet = new TreeSet<>(carYearComparator);
        carTreeSet.add(car1);
        carTreeSet.add(car2);
        carTreeSet.add(car3);
        carTreeSet.add(car4);
        print(carTreeSet);
    }
}
