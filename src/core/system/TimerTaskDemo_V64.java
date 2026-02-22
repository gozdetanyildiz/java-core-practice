package core.system;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskDemo_V64 {
    public static void main(String[] args) {

        // Timer = Belirli zamanlarda veya periyodik olarak görev planlayan sınıftır
        //         Kullanım alanları: bildirim gönderme, zamanlanmış güncellemeler,
        //         tekrarlayan işlemler

        // TimerTask = Timer tarafından çalıştırılacak görevi temsil eder
        //             Görevi tanımlamak için TimerTask sınıfını extend edersin
        //             Bir alt sınıf oluşturup run() metodunu @Override edersin

        Timer timer = new Timer();

        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                System.out.println("Merhaba!");
            }
        };

        timer.schedule(task, 0, 1000); // (görev, gecikme, tekrar süresi)

    }
}
