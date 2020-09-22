package touro.snake;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class BackgroundSound {

    public void playMusic() {

        try {

            File musicPath = new File("src/main/resources/TheSpectre.wav");

            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (Exception ex) {

            ex.printStackTrace();

        }
    }
}
