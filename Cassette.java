/**
 * @author Ben Friend
 */
import java.util.ArrayList;

public class Cassette implements AnalogAlbum{

    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex=1;

    /**
     * constructos
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     * takes in 5 songs
     */
    public Cassette (String song1, String song2, String song3, String song4, String song5){
        songs.add("placeHolder");
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * plays the current song
     */
    @Override
    public String play() {
        if(currentIndex>5){
            return "You must rewind at the end of the tape";
        } else {
            currentIndex++;
            return "playing song "+(currentIndex-1)+": "+songs.get(currentIndex-1);
        }
    }

    /**
     * fast forwards to the next song
     */
    @Override
    public String ffwd() {
        if(currentIndex==5){
            currentIndex++;
            return "Fast forwarded to the end of the tape";
        } else if (currentIndex>5) {
            return "You must rewind at the end of the tape";
        } else {
            currentIndex++;
            return "Forward to song "+(currentIndex);
        }
    }

    /**
     * rewinds to the previous song
     */
    @Override
    public String rewind() {
        if(currentIndex==1){
            return "Fully re-wound";
        } else {
            currentIndex=currentIndex-1;
            return "Rewinding to song "+currentIndex;
        }
    }

    /**
     * puases the current song
     */
    @Override
    public String pause() {
        return "pausing...";
    }

    /**
     * stops and ejects the cassette
     */
    @Override
    public String stopEject() {
        return "Stopping cassette and ejecting";
    }
    
}
