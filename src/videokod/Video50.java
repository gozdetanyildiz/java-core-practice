package videokod;

public class Video50 {
    public static void main(String[] args) {
        // Polymorphism

        Car_50 car = new Car_50();
        Bike_50 bike = new Bike_50();
        Boat_50 boat = new Boat_50();


        Vehicle_50[] vehicles = {car, bike, boat}; //ortak üst sınıf

        for (Vehicle_50 vehicle : vehicles) {
            vehicle.go();
        }
    }
}
