package core.basics;

import java.util.Scanner;

public class PatternPrintingWithNestedLoops_V25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Satır sayısını girin: ");
        rows = scanner.nextInt();

        System.out.print("Sütun sayısını girin: ");
        columns = scanner.nextInt();

        System.out.print("Kullanılacak sembolü girin: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
