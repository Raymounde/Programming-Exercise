package Adapter.MediaPlayer;

import Adapter.MediaAdapter.MediaAdapter;

/**
 * Created by Alfie on 4/25/2017.
 * AudioPlayer.java
 *
 * This plays the audio
 */
public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("MP3")) {
            System.out.println("Playing MP3 file. FileName: " + fileName);
        }
        else if (audioType.equalsIgnoreCase("MP4") || audioType.equalsIgnoreCase("VLC")) {
            MediaAdapter player = new MediaAdapter(audioType);

            player.play(audioType, fileName);
        }
        else {
            System.out.println("Unsupported file.");
        }
    }
}
