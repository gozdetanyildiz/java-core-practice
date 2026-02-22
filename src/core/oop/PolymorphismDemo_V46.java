package core.oop;

public class PolymorphismDemo_V46 {
    public static void main(String[] args) {

        Dog2 dog = new Dog2();
        Cat2 cat = new Cat2();
        Fish2 fish = new Fish2();

        dog.move();
        cat.move();
        fish.move();
    }
}
