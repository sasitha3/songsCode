package songs.users;

import java.util.List;

public class Artist extends User {

    private int noOfSongs;
    private String gerne;
    private User user;
    private List<Song> songsList;

    public Artist(User user, int noOfSongs, String gerne, List<Song> songsList) {
        
        super(user);
        this.noOfSongs = noOfSongs;
        this.gerne = gerne;
        this.songsList = songsList;
    }

    public void storeAndPrintSongs() {
       
    }
    
    @Override
    public void printDetails() {
        System.out.println("name        : " + user.name);
        System.out.println("email       : " + user.email);
        System.out.println("No of songs : " + this.noOfSongs);
        System.out.println("Song Type   : " + this.gerne);
    }
}
