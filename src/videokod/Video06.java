package videokod;

import java.util.Scanner;

public class Video06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '₺';
        double total;

        System.out.print("Hangi ürünü satın almak istiyorsunuz?: ");
        item = scanner.nextLine();

        System.out.print("Bir tanesinin fiyatı nedir?: ");
        price = scanner.nextDouble();

        System.out.print("Kaç adet almak istiyorsunuz?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\n" + quantity + " adet " + item + " satın aldınız.");
        System.out.println("Toplam tutar: " + currency + total);

        scanner.close();
    }
}
