package AbstractFactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory=new TruckFactory();
        Vehicle vehicle=factory.creatVehicle();
        vehicle.drive();

        
        
    }
}
