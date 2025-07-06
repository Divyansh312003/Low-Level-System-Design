package Issue;

public class Bicycle implements Vehicle {
    @Override
    public Integer numberOfWheels() {
        return 2;
    }

    @Override
    public Boolean hasEngine() {
        return null;
    }
}
