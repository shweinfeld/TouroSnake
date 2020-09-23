package touro.snake;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.InputStream;

public class BackgroundSound {

    public void playMusic() {

        try {

            String musicPath = "TheSpectre.wav";

            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(musicPath);
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(inputStream);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (Exception ex) {

            ex.printStackTrace();

        }
    }
}
