package core.system;
import java.util.Scanner;

public class DaemonThreadDemo_V69 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MyRunnable_69 myRunnable = new MyRunnable_69();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("İsmini girmek için 10 saniyen var");
        System.out.print("İsmini gir: ");
        String name = scanner.nextLine();
        System.out.println("Merhaba " + name);

        scanner.close();
    }
}
