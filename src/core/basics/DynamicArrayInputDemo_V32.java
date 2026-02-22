package core.basics;

import java.util.Scanner;

public class DynamicArrayInputDemo_V32 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] foods = new String[3];
        int size;

        System.out.println("Kaç tane yemek girmek istiyorsun?");
        size = scanner.nextInt();
        scanner.nextLine(); //bufferı temizler nextintten gelene enterı !!!!

        foods = new String[size];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Bir yemek gir: ");
            foods[i] = scanner.nextLine();
        }

        System.out.println("\nGirdiğin yemekler:");

        for (String food : foods) {
            System.out.println(food);
        }

        scanner.close();
    }
}
