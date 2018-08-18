package enummapset;

import java.util.*;

public class StartEnum {
    public static void main(String[] args) {
        EnumSet<WeekDay> holidays = EnumSet.of(WeekDay.SATURDAY, WeekDay.SUNDAY);

        ArrayList<Car> minivanCars = new ArrayList<>();
        minivanCars.add(new Car("Toyota"));
        minivanCars.add(new Car("BMW"));

        ArrayList<Car> sportCars = new ArrayList<>();
        sportCars.add(new Car("Lexus"));
        sportCars.add(new Car("Audi"));

        EnumMap<CarType, ArrayList<Car>> enumMap = new EnumMap<>(CarType.class);
        enumMap.put(CarType.MINIVAN, minivanCars);
        enumMap.put(CarType.SPORT, sportCars);

        iterateMap(enumMap);
    }

    private static void iterateMap(Map map) {
        Iterator<Map.Entry<CarType, Car>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<CarType, Car> carEntry = iterator.next();
            System.out.println(carEntry.getKey() + " - " + carEntry.getValue());
        }
    }
}
