public class TruckCar implements CarInterface {
    private EngineInterface engine;
    private int numberOfWheels;
    private Brand brand;





    public TruckCar(EngineInterface engine, int numberOfWheels, Brand brand) {
        this.engine = engine;
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
    }

    int getNumberOfWheels() {
        return numberOfWheels;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String checkEngine() {
        return engine.getRotation() + " " + "OK";
    }

    @Override
    public String turnToSide(String side) {
        System.out.println("bla");
        return switch (side) {
            case "right" -> "turned right";
            case "left" -> "turned left";
            default -> "going straight";
        };
    }

    public String honk() {
        return "honk";
    }
}