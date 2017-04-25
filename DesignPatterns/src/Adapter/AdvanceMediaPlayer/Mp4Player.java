package Adapter.AdvanceMediaPlayer;

/**
 * Created by Alfie on 4/25/2017.
 * Mp4Player
 */
public class Mp4Player implements AdvanceMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //Do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file. Filename: " + fileName);
    }
}
