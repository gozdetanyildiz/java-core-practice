package core.oop;

public class Carr {
    String model;
    String color;

    Carr(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive() {
        System.out.println("You drive the " + this.color + " " + this.model);
    }
}
