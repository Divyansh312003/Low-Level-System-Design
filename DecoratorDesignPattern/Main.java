package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza=new ExtraCheese(new Mushroom(new Margerita()));
        System.out.println(basePizza.cost());
    }
}
