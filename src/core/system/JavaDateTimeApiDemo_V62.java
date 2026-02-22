package core.system;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDateTimeApiDemo_V62 {
    public static void main(String[] args) {

        // Java ile tarih saat kullanımı


        // Mevcut tarih
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // Mevcut saat
        LocalTime time = LocalTime.now();
        System.out.println(time);

        // Mevcut tarih ve saat
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // UTC zaman damgası
        Instant instant = Instant.now();
        System.out.println(instant);

        // Özel format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        // Tarih ve saat karşılaştırma
        LocalDateTime date1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0); // NOEL
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0); // YENİ YIL

        if(date1.isBefore(date2)){
            System.out.println(date1 + " tarihi " + date2 + " tarihinden daha erkendir");
        }
        else if(date1.isAfter(date2)){
            System.out.println(date1 + " tarihi " + date2 + " tarihinden daha sonradır");
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1 + " tarihi " + date2 + " tarihiyle aynıdır");
        }
    }
}
