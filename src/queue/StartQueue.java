package queue;

import java.util.*;

// Лучше использовать Deque (двусторонняя очередь) и напрямую использовать методы addFirst(), getLast() и т.д.
public class StartQueue {
    public static void main(String[] args) {
        // FIFO (first-in-first-out) - ОЧЕРЕДЬ

        // Ограничение на количество элементов
        // Queue<Car> cars = new ArrayBlockingQueue<Car>(5);

        // Без ограничения
        Deque<Car> cars = new ArrayDeque<>();

        Car car1 = new Car("Nissan");
        Car car2 = new Car("BMW");
        Car car3 = new Car("Toyota");
        Car car4 = new Car("KIA");
        Car car5 = new Car("NIVA");
        Car car6 = new Car("Lexus");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        // Получение верхнего элемента без удаления из очереди
        System.out.println("lifoQueue.element() = " + cars.element());

        // Получение верхнего элемента с удалением из очереди
        System.out.println("lifoQueue.remove() = " + cars.remove());

        /*
            ------------------------------------------------------------------------------------------------------------
         */

        // LIFO (last-in-first-out) - СТЭК
        // #1
        Queue<Car> lifoQueue = Collections.asLifoQueue(cars);
        lifoQueue.add(car1);
        lifoQueue.add(car2);
        lifoQueue.add(car3);
        lifoQueue.add(car4);
        lifoQueue.add(car5);
        lifoQueue.add(car6);

        // Получение верхнего элемента без удаления из очереди
        System.out.println("lifoQueue.element() = " + lifoQueue.element());

        // Получение верхнего элемента с удалением из очереди
        System.out.println("lifoQueue.remove() = " + lifoQueue.remove());

        // #2
        LinkedList<Car> lifoLinked = new LinkedList<>();
        lifoLinked.push(car1);
        lifoLinked.push(car2);
        lifoLinked.push(car3);
        lifoLinked.push(car4);
        lifoLinked.push(car5);
        lifoLinked.push(car6);

        // Получение верхнего элемента без удаления из очереди
        System.out.println("lifoLinked.element() = " + lifoLinked.element());

        // Получение верхнего элемента с удалением из очереди
        System.out.println("lifoLinked.remove() = " + lifoLinked.remove());
    }
}
