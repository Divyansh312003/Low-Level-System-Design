package NullObjectDesignPattern;

public class VehicleFactory {
    static Vehicle getVehicle(String vehicleType) {
        if(vehicleType.equals("Car")){
            return new Car();
        }
        return new NullObject();
    }
}
