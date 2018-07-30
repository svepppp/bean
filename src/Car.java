import di.Auto;

public class Car {
    //    @Deprecated
//    @Auto(isRequired = true)
    @Auto
    private Engine engine;
    //    @Auto(isRequired = true)
    @Auto
    private Gear gear;

    public Car() {
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", gear=" + gear +
                '}';
    }
}
