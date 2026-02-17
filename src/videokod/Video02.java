package videokod;

public class Video02 {
    public static void main(String[] args) {


        //  Primitive stack        vs      Reference heap
        //    ---------                      ---------
        //    int                           String
        //    double                        dizi (array)
        //    char                          nesne (object)
        //    boolean

        int age = 21;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "kırmızı";

        System.out.println("Seçiminiz: " + color + " " + year + " model " + car);
        System.out.println("Fiyatı: " + currency + price);

        if (forSale) {
            System.out.println(car + " satışta.");
        } else {
            System.out.println(car + " satışta değil.");
        }
    }
}
