package Solution;

public class Main {
    public static void main(String[] args) {
       EngineVehicle vehicle=new Bike();
       System.out.println(vehicle.hasEngine());

       NonEngineVehicle vehicle1=new Bicycle();
//       System.out.println(vehicle1.hasEngine()); // this line will now give error
    }
}
