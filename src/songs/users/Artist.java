/**
M C K Wijesuriya 
IT15127556
Prorata
 */
package songs.users;

import java.util.List;

public class Artist extends User implements UserDetails{

    int noOfSongs;
    String gerne;
    User user;
    public List<Song> songsList;

    public Artist(User user, int noOfSongs, String gerne, List<Song> songsList) {
        
        super(user);
        this.user = user;
        this.noOfSongs = noOfSongs;
        this.gerne = gerne;
        this.songsList = songsList;
    }

    public void storeAndPrintSongs() {
       
    }
    
   public void printDetails() {
      System.out.println("No of songs : " + this.noOfSongs);
      System.out.println("Song Type   : " + this.gerne);
      System.out.println("Song List:");
      
      for(Song model : songsList) {
            System.out.println(model.getName() + "\t" + model.getPrice());
        }
   }

}
