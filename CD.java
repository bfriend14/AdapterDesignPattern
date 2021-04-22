/**
 * @author Ben Friend
 */
import java.util.ArrayList;

public class CD implements DigitalAlbum{

    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex=1;

    /**
     * constructor
     * @param song1
     * @param song2
     * @param song3
     * @param song4
     * @param song5
     * takes in 5 songs
     */
    public CD (String song1, String song2, String song3, String song4, String song5){
        songs.add("placeHolder");
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * plays the first song
     */
    @Override
    public String playFromBeginning() {
        currentIndex=1;
        return playSong(currentIndex);
    }

    /**
     * plays a specific song
     * @param num takes in the number of a specific song
     */
    @Override
    public String playSong(int num) {
        if(currentIndex>5){
            return "Not a vlid song number";
        } else {
            currentIndex++;
            return "playing song "+(currentIndex-1)+": "+songs.get(currentIndex-1);
        }
    }

    /**
     * plays the previous song
     */
    @Override
    public String prevSong() {
        if(currentIndex<=1){
            currentIndex=1;
        } else {
            currentIndex=currentIndex-1;
        }
        return "Skipping back and playing: "+songs.get(currentIndex-1);
    }

    /**
     * plays the next song
     */
    @Override
    public String nextSong() {
        if(currentIndex>5){
            currentIndex=1;
            return "playinging song: "+(currentIndex)+": "+songs.get(currentIndex);
        } else {
            currentIndex++;
            return "playinging song: "+(currentIndex-1)+": "+songs.get(currentIndex-1);
        }
    }

    /**
     * stops the music
     */
    @Override
    public String stop() {
        currentIndex=1;
        return "Stopping CD";
    }

    /**
     * pauses the music
     */
    @Override
    public String pause() {
        return "pausing...";
    }

    
}
