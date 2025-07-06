package StrategyDesignPattern.WithStrategyPattern;

public class Vehicle {
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy ds){
        this.driveStrategy=ds;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
