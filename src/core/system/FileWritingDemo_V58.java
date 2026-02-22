package core.system;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class FileWritingDemo_V58 {
    public static void main(String[] args) {

// dosya yazdırma

        //FileWriter → Küçük/orta boy metin dosyaları için basit yazma aracı
        //BufferedWriter → Büyük metinlerde daha hızlı ve performanslı
        //PrintWriter → Düzenli/formatlı çıktı (rapor, log) için uygun
        //FileOutputStream → Resim, ses gibi binary dosyalar için


        String filePath = "test.txt";
        String textContent = """
                Roses are Red
                Violets are Blue
                BOOTY BOOTY BOOTY
                ROCKIN' EVERWHERE!
                """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("Dosya başarıyla yazıldı");
        }
        catch(FileNotFoundException e){
            System.out.println("Dosya konumu bulunamadı");
        }
        catch(IOException e){
            System.out.println("Dosya yazılamadı");
        }
    }
}
