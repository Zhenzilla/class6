public abstract class AbstractCar {
    AbstractEngine engine;


    public AbstractCar(AbstractEngine engine){
        this.engine = engine;

    }

    String checkEngine(){
        return engine.getRotation() + " " + "OK";
    }

    String turnToSide(String side) {
       return switch (side) {
           case "right" -> "turned right";
           case "left" -> "turned left";
           default -> "going straight";
       };
    }


}
