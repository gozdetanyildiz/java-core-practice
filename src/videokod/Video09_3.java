package videokod;

import java.util.Scanner;

public class Video09_3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Yarıçapı girin: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Çevre: %.1f cm\n", circumference);
        System.out.printf("Alan: %.1f cm²\n", area);
        System.out.printf("Hacim: %.1f cm³\n", volume);

        scanner.close();
    }
}
