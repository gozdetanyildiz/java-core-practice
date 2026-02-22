package core.projects;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioPlaybackDemo_V60 {
    public static void main(String[] args) {
        // How to PLAY AUDIO with Java (.wav, .au, .aiff)
        String filePath = "src/videokod/viralaudio-descent-whoosh-long-cinematic-sound-effect-405921.wav";
        File file = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            System.out.println("No problems detected");

            // İstersen burada clip.start(); ekleyebilirsin (sesin başlaması için)
             clip.start();
            System.out.println("Press Enter to exit...");
            new java.util.Scanner(System.in).nextLine();

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        } catch (IOException e) {
            System.out.println("Could not locate file");
        }
    }
}
