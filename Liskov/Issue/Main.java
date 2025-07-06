package Issue;

import Issue.Bicycle;
import Issue.Bike;
import Issue.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Bike();
        Vehicle vehicle1=new Bicycle();

        System.out.println(vehicle.numberOfWheels().toString());
        System.out.println(vehicle1.numberOfWheels().toString());

        System.out.println(vehicle.hasEngine().toString());
        System.out.println(vehicle1.hasEngine().toString());








    }
}
