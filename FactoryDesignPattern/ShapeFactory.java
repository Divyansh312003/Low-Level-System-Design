package FactoryDesignPattern;

public class ShapeFactory {
    Shape getShape(String input){
        switch (input) {
            case "Circle":
                return new Circle();
            case "Sqaure":
               return new Sqaure();
            default:
                return null;
        }
    }
}
