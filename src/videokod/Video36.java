package videokod;

import java.util.Scanner;

public class Video36 {
    public static void main(String[] args) {

        String[] questions = {
                "Router'ın temel görevi nedir?",
                "Bilgisayarın beyni olarak kabul edilen parça hangisidir?",
                "Facebook hangi yıl kuruldu?",
                "Bilgisayarın babası olarak kim bilinir?",
                "İlk programlama dili hangisidir?"
        };

        String[][] options = {
                {"1. Dosya depolamak", "2. Verileri şifrelemek", "3. İnternet trafiğini yönlendirmek", "4. Şifreleri yönetmek"},
                {"1. CPU", "2. Hard Disk", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}
        };

        int[] answers = {3, 1, 2, 4, 3};

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("**********************");
        System.out.println("Java Quiz Oyununa Hoş Geldin!");
        System.out.println("**********************");

        for (int i = 0; i < questions.length; i++) {

            System.out.println();
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Tahminini gir: ");
            int guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("********");
                System.out.println("DOĞRU!");
                System.out.println("********");
                score++;
            } else {
                System.out.println("********");
                System.out.println("YANLIŞ!");
                System.out.println("Doğru cevap: " + answers[i]);
                System.out.println("********");
            }
        }

        System.out.println();
        System.out.println("Final Skor: " + score + "/" + questions.length);

        scanner.close();
    }
}
