package core.projects;

import java.util.Scanner;

public class WeightConverter_V15 {
    public static void main(String[] args) {
        // KİLO DÖNÜŞÜM PROGRAMI

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Kilo Dönüşüm Programı");
        System.out.println("1: Pound'u Kilograma çevir");
        System.out.println("2: Kilogramı Pound'a çevir");

        System.out.print("Bir seçenek seçin: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Ağırlığı pound (lbs) cinsinden girin: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Yeni ağırlık kilogram (kg) cinsinden: %.2f", newWeight);
        }
        else if (choice == 2) {
            System.out.print("Ağırlığı kilogram (kg) cinsinden girin: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Yeni ağırlık pound (lbs) cinsinden: %.2f", newWeight);
        }
        else {
            System.out.println("Geçerli bir seçenek seçmediniz.");
        }

        scanner.close();
    }
}
