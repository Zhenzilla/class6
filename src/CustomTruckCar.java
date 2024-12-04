public class CustomTruckCar extends TruckCar{

    public CustomTruckCar(EngineInterface engine, int numberOfWheels, Brand brand) {
        super(engine, numberOfWheels, brand);

    }
    String labelTruck(){
        return "truck labeled";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


enum Brand {
    reno,
    tiggo,
    pejo;
}

