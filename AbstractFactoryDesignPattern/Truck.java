package AbstractFactoryDesignPattern;

public class Truck implements Vehicle {

    @Override
    public void drive() {
       System.out.println("Truck is driving");
    }

    @Override
    public void stop() {
        System.out.println("Truck is driving");
    }
    
}
