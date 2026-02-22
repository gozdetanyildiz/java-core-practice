package core.projects;

import java.util.Scanner;

public class CompoundInterestCalculator_V11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Ana para miktarını girin: ");
        principal = scanner.nextDouble();

        System.out.print("Faiz oranını girin (% olarak): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Faiz yılda kaç kez bileşik uygulanıyor?: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Kaç yıl yatırılacak?: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("%d yıl sonunda toplam tutar: ₺%.2f", years, amount);

        scanner.close();
    }
}
