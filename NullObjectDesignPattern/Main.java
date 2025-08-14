package NullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle= VehicleFactory.getVehicle("Ca");
        System.out.println("Tank Capacity: " + vehicle.getTankCapacity());
        System.out.println("Number of Wheels: " + vehicle.getNumberOfWheels());
    }
}
