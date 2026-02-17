package videokod;

public class Video52 {
    public static void main(String[] args) {

        Car_52 car = new Car_52("Charger", "Yellow", 10000);

        car.setColor("Blue");
        car.setPrice(5000);

        System.out.println(
                car.getColor() + " " +
                        car.getModel() + " " +
                        car.getPrice()
        );
    }
}
