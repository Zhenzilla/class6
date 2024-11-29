public class HydrogenCar implements CarInterface {
    private EngineInterface engine;

    public HydrogenCar(EngineInterface engine) {
        this.engine = engine;
    }

    @Override
    public String checkEngine() {
        return engine.getRotation() + " " + "OK";
    }

    @Override
    public String turnToSide(String side) {
        return switch (side) {
            case "right" -> "turned right";
            case "left" -> "turned left";
            default -> "going straight";
        };
    }
}