package Adapter.MediaAdapter;

import Adapter.AdvanceMediaPlayer.AdvanceMediaPlayer;
import Adapter.AdvanceMediaPlayer.Mp4Player;
import Adapter.AdvanceMediaPlayer.VlcPlayer;
import Adapter.MediaPlayer.MediaPlayer;

/**
 * Created by Alfie on 4/25/2017.
 * MediaAdapter.java
 *
 * This class will be used by AudioPlayer to support VLC and MP4
 */
public class MediaAdapter implements MediaPlayer{
    private AdvanceMediaPlayer player;

    public MediaAdapter(String audioType)
    {
        if(audioType.equalsIgnoreCase("VLC")) {
            player = new VlcPlayer();
        }
        else if (audioType.equalsIgnoreCase("MP4")) {
            player = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("VLC")) {
            player.playVlc(fileName);
        }
        else if (audioType.equalsIgnoreCase("MP4")) {
            player.playMp4(fileName);
        }
    }
}
