public class TruckCar implements CarInterface {
    private EngineInterface engine;
    private int numberOfWheels;

    public TruckCar(EngineInterface engine, int numberOfWheels) {
        this.engine = engine;
        this.numberOfWheels = numberOfWheels;
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