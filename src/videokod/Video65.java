package videokod;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Video65 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geri sayım kaç saniyeden başlasın: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;

                if (count < 0) {
                    System.out.println("MUTLU YILLAR!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); //(task, delay, period)
    }
}
