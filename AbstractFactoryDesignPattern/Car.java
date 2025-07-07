package AbstractFactoryDesignPattern;

public class Car implements Vehicle {

    @Override
    public void drive() {
       System.out.println("Car is driving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }
    
}
