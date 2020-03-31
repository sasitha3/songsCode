/**
M C K Wijesuriya 
IT15127556
Prorata
 */
package songs;

import songs.interfaces.Calculations;
import songs.users.Artist;
import songs.users.Song;

public class PlayaSong implements Calculations {
   
    @Override
    public void calculateRevenue(Artist artist, int downloads) {
       
       double avgSong = 0;
       System.out.println("Artist: " + artist.name);
       for(Song model : artist.songsList) {
            avgSong = avgSong + model.getPrice();
        }
       avgSong = avgSong/artist.songsList.size();
       System.out.println("Album revenue is LKR: " + (avgSong*downloads));
    }
}
