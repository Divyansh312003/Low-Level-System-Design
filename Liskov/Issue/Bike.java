package Issue;

public class Bike implements Vehicle {


    @Override
    public Integer numberOfWheels() {
        return 2;
    }

    @Override
    public Boolean hasEngine() {
        return true;
    }
}