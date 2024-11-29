public class CustomTruckCar extends TruckCar{
    public CustomTruckCar(EngineInterface engine, int numberOfWheels) {
        super(engine, numberOfWheels);
    }

    String labelTruck(){
        return "truck labeled";
    }
}
