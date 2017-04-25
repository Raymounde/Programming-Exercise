package Adapter.MediaPlayer;

/**
 * Created by Alfie on 4/25/2017.
 * MediaPlayer.java
 *
 * This interface actually only supports MP3
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
