package StrategyDesignPattern.WithStrategyPattern;

public class SportsVehicle extends Vehicle {
    SportsVehicle(){super(new SpecialDrive());}
}
