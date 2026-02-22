package core.oop;

public class ObjectArrayDemo_V42 {
    public static void main(String[] args) {

        Carr[] cars = {
                new Carr("Mustang", "Red"),
                new Carr("Corvette", "Blue"),
                new Carr("Charger", "Yellow")
        };


        for (Carr car : cars) {
            car.color = "Black";
        }

        for (Carr car : cars) {
            car.drive();
        }

    }
}
