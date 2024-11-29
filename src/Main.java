import java.util.ArrayList;

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

        TruckCar truckCar = new TruckCar(dieselEngine, 4);
        System.out.println(truckCar.turnToSide("right"));
        System.out.println(truckCar.honk());

        ArrayList<CustomTruckCar> truckCars = new ArrayList<>();
        CustomTruckCar customTruckCar1 = new CustomTruckCar(hydrogenEngine1, 5);
        CustomTruckCar customTruckCar2 = new CustomTruckCar(dieselEngine, 10);
        truckCars.add(customTruckCar1);
    }
}