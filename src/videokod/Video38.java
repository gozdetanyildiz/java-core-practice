package videokod;

import java.util.Random;
import java.util.Scanner;

public class Video38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bakiye = 100;
        int bahis;
        int kazanc;
        String[] satir;
        String tekrarOyna;

        System.out.println("*************************");
        System.out.println(" Java Slot Oyununa Hoş Geldin ");
        System.out.println("Semboller: 🍒 🍉 🍋 🔔 🌟 ");
        System.out.println("*************************");

        while (bakiye > 0) {
            System.out.println("Mevcut bakiye: $" + bakiye);
            System.out.print("Bahis miktarını gir: ");
            bahis = scanner.nextInt();
            scanner.nextLine(); // Enter'ı temizler

            if (bahis > bakiye) {
                System.out.println("YETERSİZ BAKİYE!");
                continue;
            } else if (bahis <= 0) {
                System.out.println("Bahis 0'dan büyük olmalı!");
                continue;
            }

            bakiye -= bahis;

            System.out.println("Çevriliyor...");
            satir = spinRow();
            printRow(satir);

            kazanc = getPayout(satir, bahis);

            if (kazanc > 0) {
                System.out.println("Tebrikler! $" + kazanc + " kazandın!");
                bakiye += kazanc;
            } else {
                System.out.println("Maalesef bu tur kaybettin.");
            }

            System.out.print("Tekrar oynamak ister misin? (E/H): ");
            tekrarOyna = scanner.nextLine().trim().toUpperCase();

            if (!tekrarOyna.equals("E")) {
                break;
            }
        }

        System.out.println("OYUN BİTTİ! Son bakiyen: $" + bakiye);
        scanner.close();
    }

    static String[] spinRow() {
        String[] semboller = {"🍒", "🍉", "🍋", "🔔", "🌟"};
        String[] satir = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            satir[i] = semboller[random.nextInt(semboller.length)];
        }
        return satir;
    }

    static void printRow(String[] satir) {
        System.out.println("**********");
        System.out.println(" " + String.join(" | ", satir));
        System.out.println("**********");
    }

    static int getPayout(String[] satir, int bahis) {
        if (satir[0].equals(satir[1]) && satir[1].equals(satir[2])) {
            return switch (satir[0]) {
                case "🍒" -> bahis * 3;
                case "🍉" -> bahis * 4;
                case "🍋" -> bahis * 5;
                case "🔔" -> bahis * 10;
                case "🌟" -> bahis * 20;
                default -> 0;
            };
        }
        return 0;
    }
}
