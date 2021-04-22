/**
 * @author Ben Friend
 */
public class AnalogAdapter implements AnalogAlbum{

    private DigitalAlbum album;

    /**
     * constructor
     * @param album takes in an instance of an album
     */
    public AnalogAdapter(DigitalAlbum album){
        this.album=album;
    }

    /**
     * plays the next song
     * @return a string representation of the next song
     */
    @Override
    public String play() {
        return album.nextSong();
    }

    /**
     * plays the next song
     * @return a string representation of the next song
     */
    @Override
    public String ffwd() {
        return album.nextSong();
    }

    /**
     * plays the previous song
     * @return a string representation of the previous song
     */
    @Override
    public String rewind() {
        return album.prevSong();
    }

    /**
     * pauses the current song
     */
    @Override
    public String pause() {
        return album.pause();
    }

    /**
     * stops the current music
     * @return a string representation of the music stopping
     */
    @Override
    public String stopEject() {
        return album.stop();
    }

  
    
}
