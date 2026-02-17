package videokod;
import java.util.Random;
import java.util.Scanner;

public class Video37 {
    public static void main(String[] args) {
        // TAŞ KAĞIT MAKAS OYUNU

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"taş", "kağıt", "makas"};
        String playerChoice;
        String computerChoice;
        String playAgain = "evet";

        do{
            System.out.print("Hamleni gir (taş, kağıt, makas): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("taş") &&
                    !playerChoice.equals("kağıt") &&
                    !playerChoice.equals("makas")){
                System.out.println("Geçersiz seçim!");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Bilgisayarın seçimi: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("Berabere!");
            }
            else if((playerChoice.equals("taş") && computerChoice.equals("makas")) ||
                    (playerChoice.equals("kağıt") && computerChoice.equals("taş")) ||
                    (playerChoice.equals("makas") && computerChoice.equals("kağıt"))){
                System.out.println("Kazandın!");
            }
            else{
                System.out.println("Kaybettin!");
            }

            System.out.print("Tekrar oynamak ister misin? (evet/hayır): ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("evet"));

        System.out.println("Oynadığın için teşekkürler!");

        scanner.close();
    }
}
