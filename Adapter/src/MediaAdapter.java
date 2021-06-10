public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer amp;

    MediaAdapter(String mediaType) {
        if (mediaType.equals("vlc")) {
            amp = new VlcPlayer();
        } else if (mediaType.equals("mp4")) {
            amp = new Mp4Player();
        }
    }

    @Override
    public void play(String mediaType) {
        if (mediaType.equals("vlc")) {
            amp.playVlc();
        } else if (mediaType.equals("mp4")) {
            amp.playMp4();
        }
    }
}
