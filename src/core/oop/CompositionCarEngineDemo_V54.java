package core.oop;

public class CompositionCarEngineDemo_V54 {
    public static void main(String[] args) {
        // car_54 Engine_54

        Car_54 car = new Car_54("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}
