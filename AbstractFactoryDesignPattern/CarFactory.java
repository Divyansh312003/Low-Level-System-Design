package AbstractFactoryDesignPattern;

public class CarFactory extends VehicleFactory {

    @Override
    public Vehicle creatVehicle() {
       return new Car();
    }
    
}
