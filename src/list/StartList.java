package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class StartList {
    /* ordered;
       в основе массив;
       преимущества:
            - получение объекта по индексу;
            - запись объекта по индексу.
    */
    public static void arrayListExample() {
        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car("Nissan");
        Car car2 = new Car("Toyota");
        Car car3 = new Car("BMW");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println("Размер коллекции: " + cars.size());

        System.out.println("Содержит коллекция машину Nissan? " + cars.contains("Nissan"));

        int index = cars.indexOf(car3);
        System.out.println("Индекс машины Toyota: " + 1);

        Car selectedCar = cars.get(2);
        System.out.println("Выбранная машина: " + selectedCar.getName());

        System.out.println("Пустая ли коллекция? " + cars.isEmpty());

        Iterator<Car> iterator = cars.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }

    /*
         ordered;
         в основе двусвязный список;
         используется для создания очереди, стека;
         преимущества:
                - добавление объекта;
                - удаление объекта.
    */
    public static void linkedListExample() {
        LinkedList<Car> cars = new LinkedList<>();

        Car car1 = new Car("Volvo");
        Car car2 = new Car("Lada");
        Car car3 = new Car("Mazda");
        Car car4 = new Car("BMW");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        // Итератор в обратную сторону
        Iterator<Car> iterator = cars.descendingIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }

    public static void main(String[] args) {
        arrayListExample();
        linkedListExample();
    }
}
