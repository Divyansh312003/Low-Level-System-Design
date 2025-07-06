package StrategyDesignPattern.WithStrategyPattern;

public class SpecialDrive implements DriveStrategy {
    @Override
    public void drive(){
        System.out.println("Special Drive capability");
    }
    
}
