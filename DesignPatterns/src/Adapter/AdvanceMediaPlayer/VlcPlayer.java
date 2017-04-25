package Adapter.AdvanceMediaPlayer;

/**
 * Created by Alfie on 4/25/2017.
 * VlcPlayer.java
 */
public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file. Filename: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //Do nothing
    }
}
