public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String mediaType) {
        if (mediaType.equals("mp3")) {
            System.out.println("Mp3 Media played");
        } else if (mediaType.equals("vlc") || mediaType.equals("mp4")) {
            MediaAdapter ma = new MediaAdapter(mediaType);
            ma.play(mediaType);
        } else {
            System.out.println("Media type not supported");
        }
    }
}
