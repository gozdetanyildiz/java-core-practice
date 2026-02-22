package core.system;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReadingDemo_V59 {

        public static void main(String[] args) {



            // BufferedReader + FileReader: Metin dosyalarını satır satır okumak için en uygunudur
            // FileInputStream: İkili (binary) dosyalar için en uygunudur (örneğin resim, ses dosyaları)
            // RandomAccessFile: Büyük bir dosyanın belirli kısımlarını okuma/yazma için uygundur

            String filePath = "C:\\Users\\User\\Desktop\\test.txt";

            try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

                String line;
                while((line = reader.readLine()) != null){
                    System.out.println(line);
                }
            }
            catch(FileNotFoundException e){
                System.out.println("Could not locate file");
            }
            catch(IOException e){
                System.out.println("Something went wrong");
            }
        }
    }
