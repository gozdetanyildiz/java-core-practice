package videokod;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Video57 {
    public static void main(String[] args) {

        // try{}, catch{}, finally{} =
        //             (Sıfıra bölme, dosya bulunamaması, yanlış veri tipi girilmesi)
        //
        //             try{}, catch{}, finally{}

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Bir sayı gir: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("Bu bir sayı değildi!");
        } catch (ArithmeticException e) {
            System.out.println("SIFIRA BÖLEMEZSİN!");
        } catch (Exception e) {
            //
            System.out.println("Bir şeyler ters gitti");
        } finally {
            System.out.println("Bu kısım her zaman çalışır");
        }
    }
}
