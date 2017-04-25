package Adapter.Main;

import Adapter.MediaPlayer.AudioPlayer;

/**
 * Created by Alfie on 4/25/2017.
 * Main.java
 */
public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("MP3", "Tralala");
        player.play("MP4", "Wahahaha");
        player.play("VLC", "Typical Andler Sander Movie");
    }

}
