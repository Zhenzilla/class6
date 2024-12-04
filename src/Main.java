import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        HydrogenEngine hydrogenEngine1 = new HydrogenEngine();
        HydrogenEngine hydrogenEngine2 = new HydrogenEngine();
        HydrogenEngine hydrogenEngine3 = new HydrogenEngine();
        HydrogenEngine hydrogenEngine4 = new HydrogenEngine();
        HydrogenEngine hydrogenEngine5 = new HydrogenEngine();
        HydrogenEngine hydrogenEngine6 = new HydrogenEngine();
        DieselEngine dieselEngine = new DieselEngine();

        ArrayList<EngineInterface> engineBox = new ArrayList<>();
        engineBox.add(hydrogenEngine1);
        engineBox.add(hydrogenEngine2);
        engineBox.add(hydrogenEngine3);
        engineBox.add(hydrogenEngine4);
        engineBox.add(hydrogenEngine5);
        engineBox.add(hydrogenEngine6);
        engineBox.add(dieselEngine);

        for (EngineInterface engine : engineBox) {
            System.out.println(engine.getRotation());
        }

        HydrogenCar car = new HydrogenCar(hydrogenEngine1);
        System.out.println(car.checkEngine());

        TruckCar truckCar = new TruckCar(dieselEngine, 4, Brand.reno);
        System.out.println(truckCar.turnToSide("right"));
        System.out.println(truckCar.honk());

        ArrayList<CustomTruckCar> truckCars = new ArrayList<>();
        CustomTruckCar customTruckCar1 = new CustomTruckCar(hydrogenEngine1, 5,Brand.reno);
        CustomTruckCar customTruckCar2 = new CustomTruckCar(dieselEngine, 10, Brand.tiggo);
        CustomTruckCar customTruckCar3 = new CustomTruckCar(dieselEngine, 10, Brand.tiggo );
        CustomTruckCar customTruckCar4 = new CustomTruckCar(dieselEngine, 10, Brand.pejo);
        CustomTruckCar customTruckCar5 = new CustomTruckCar(dieselEngine, 10, Brand.pejo);
        CustomTruckCar customTruckCar6 = new CustomTruckCar(dieselEngine, 2, Brand.pejo);
        CustomTruckCar customTruckCar7 = new CustomTruckCar(dieselEngine, 10, Brand.pejo);
        CustomTruckCar customTruckCar8 = new CustomTruckCar(dieselEngine, 10, Brand.tiggo);
        CustomTruckCar customTruckCar9 = new CustomTruckCar(dieselEngine, 10, Brand.tiggo);
        CustomTruckCar customTruckCar10 = new CustomTruckCar(dieselEngine, 10, Brand.tiggo);
        CustomTruckCar customTruckCar11 = new CustomTruckCar(dieselEngine, 10, Brand.tiggo);
        CustomTruckCar customTruckCar12 = new CustomTruckCar(dieselEngine, 7, Brand.tiggo);
        CustomTruckCar customTruckCar13 = new CustomTruckCar(dieselEngine, 10, Brand.reno);
        CustomTruckCar customTruckCar14 = new CustomTruckCar(dieselEngine, 10, Brand.reno);
        CustomTruckCar customTruckCar15 = new CustomTruckCar(dieselEngine, 10, Brand.reno);
        CustomTruckCar customTruckCar16 = new CustomTruckCar(dieselEngine, 10, Brand.reno);
        CustomTruckCar customTruckCar17 = new CustomTruckCar(dieselEngine, 10, Brand.reno);
        CustomTruckCar customTruckCar18 = new CustomTruckCar(dieselEngine, 10, Brand.reno);
        CustomTruckCar customTruckCar19 = new CustomTruckCar(dieselEngine, 10, Brand.reno);
        CustomTruckCar customTruckCar20 = new CustomTruckCar(dieselEngine, 10, Brand.reno);
        truckCars.add(customTruckCar1);
        truckCars.add(customTruckCar2);
        truckCars.add(customTruckCar3);
        truckCars.add(customTruckCar4);
        truckCars.add(customTruckCar5);
        truckCars.add(customTruckCar6);
        truckCars.add(customTruckCar7);
        truckCars.add(customTruckCar8);
        truckCars.add(customTruckCar9);
        truckCars.add(customTruckCar10);
        truckCars.add(customTruckCar11);
        truckCars.add(customTruckCar12);
        truckCars.add(customTruckCar13);
        truckCars.add(customTruckCar14);
        truckCars.add(customTruckCar15);
        truckCars.add(customTruckCar16);
        truckCars.add(customTruckCar17);
        truckCars.add(customTruckCar18);
        truckCars.add(customTruckCar19);
        truckCars.add(customTruckCar20);


        System.out.println(truckCars.get(5).getBrand().toString() + " " +  truckCars.get(5).getNumberOfWheels() + " wheels");


        ArrayList<CustomTruckCar> brandForParking = new ArrayList<>();
        for (CustomTruckCar truck : truckCars) {
            if (truck.getBrand() == Brand.reno) {
                brandForParking.add(truck);
            }

        }

        System.out.println("Trucks in BrandParking with brand reno:");
        for (var truck : brandForParking) {
            System.out.println("Truck with " + truck.getNumberOfWheels() + " wheels and brand " + truck.getBrand());
        }

        truckCars.removeIf(customTruckCar -> customTruckCar.getNumberOfWheels() == 10);
        System.out.println("Remaining trucks after removal:");
        truckCars.forEach(customTruckCar ->
                System.out.println("Truck with " + customTruckCar.getNumberOfWheels() + " wheels")
        );

        ArrayList<CustomTruckCar> cargoParking = new ArrayList<>();
        ArrayList<CustomTruckCar> publicTransportParking = new ArrayList<>();
        ArrayList<CustomTruckCar> passengerParking = new ArrayList<>();
        ArrayList<CustomTruckCar> motorcycleParking = new ArrayList<>();
        // Новый список для оставшихся автомобилей
        ArrayList<CustomTruckCar> remainingCars = new ArrayList<>();

        // Перемещение автомобилей в соответствующие зоны парковки
        for (CustomTruckCar auto : truckCars) {
            switch (auto.getNumberOfWheels()) {
                case 2:
                    motorcycleParking.add(auto);
                    break;
                case 4:
                    passengerParking.add(auto);
                    break;
                case 6:
                    cargoParking.add(auto);
                    break;
                case 8:
                    publicTransportParking.add(auto);
                    break;
                default:
                    // Если автомобиль не подходит ни под одну из категорий, добавляем его в оставшиеся
                    remainingCars.add(auto);
                    break;
            }
        }

        // Вывод результатов
        System.out.println("Motorcycle Parking: " + motorcycleParking.size() + " vehicles");
        System.out.println("Passenger Parking: " + passengerParking.size() + " vehicles");
        System.out.println("Cargo Parking: " + cargoParking.size() + " vehicles");
        System.out.println("Public Transport Parking: " + publicTransportParking.size() + " vehicles");

        // Если нужно, можно также вывести оставшиеся автомобили
        System.out.println("Remaining Cars: " + remainingCars.size() + " vehicles");

        LinkedList<CustomTruckCar> cars = new LinkedList<>();
        cars.add(customTruckCar1);



        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (i % 7 == 0) {
                strings.add("Семь");
            } else if (i % 5 == 0) {
                strings.add("Пять");
            } else if (i % 3 == 0) {
                strings.add("Три");
            } else if (i % 2 == 0) {
                strings.add("Два");
            }

        }

        System.out.println(strings);
        HashSet <String> hashSet = new HashSet<>(strings);
        System.out.println(hashSet);

        Map<String, Integer> map = hashSet.stream().collect(Collectors.toMap(x -> x, x -> 0));
        System.out.println(map);

// Добавьте элементы в HashSet
        HashMap<Integer, String> hashMap = new HashMap<>();
        int index = 1; // Начальное значение индекса
        for (String element : hashSet) {
            hashMap.put(index++, "Значение_" + element);
        }
        System.out.println(hashMap.entrySet());

        ArrayList<String> uniqueList = new ArrayList<>(hashSet);
        System.out.println(uniqueList);
    }



}
