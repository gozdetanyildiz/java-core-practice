package videokod;

import java.util.Scanner;

public class Video14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("E-posta adresinizi girin: ");

        email = scanner.nextLine();

        if (email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Kullanıcı adı: " + username);
            System.out.println("Alan adı : " + domain);
        }
        else {
            System.out.println("E-posta adresi '@' içermelidir.");
        }

        scanner.close();
    }
}
