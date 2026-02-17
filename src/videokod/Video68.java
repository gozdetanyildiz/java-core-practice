package videokod;

import java.util.Scanner;

public class Video68 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Haftanın hangi günü? (MONDAY, TUESDAY...): ");
        String response = scanner.nextLine().trim().toUpperCase();

        try {
            Day_68 day = Day_68.valueOf(response);

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->
                        System.out.println("Hafta içi");

                case SATURDAY, SUNDAY ->
                        System.out.println("Hafta sonu");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Lütfen geçerli bir gün girin!");
        }

        scanner.close();
    }
}
