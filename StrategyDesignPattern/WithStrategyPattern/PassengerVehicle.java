package StrategyDesignPattern.WithStrategyPattern;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle(){super(new NormalDrive());}
}
