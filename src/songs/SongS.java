/*
M C K Wijesuriya 
IT15127556
Prorata
 */
package songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import songs.users.Artist;
import songs.users.Operator;
import songs.users.Song;
import songs.users.User;

/**
 *
 * @author sapdlk
 */
public class SongS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter artist name: ");
      String name = sc.nextLine();
      System.out.print("Enter artist email: ");
      String email = sc.nextLine();
      System.out.print("Enter Number of songs: ");
      String noOfSongs = sc.nextLine();
      while (Integer.parseInt(noOfSongs) > 5) {
         System.out.println("Invalid Number of songs (Max : 5)");
         System.out.print("Enter Number of songs: ");
         noOfSongs = sc.nextLine();
      }
      System.out.print("Enter type: ");
      String type = sc.nextLine();
      List<songs.users.Song> songs = new ArrayList<>();
      User user = new User(name, email);
      System.out.println("Song List: ");
      for (int i = 0; i < Integer.parseInt(noOfSongs); i++) {
         
         Song sg = new Song();
         System.out.print("Enter song: ");
         String song = sc.nextLine();
         sg.setName(song);
         System.out.print("Enter rate: ");
         String rate = sc.nextLine();
         sg.setPrice(Double.parseDouble(rate));
         songs.add(sg);
      }
      
      Artist artist = new Artist(user, Integer.parseInt(noOfSongs), type, songs);
      System.out.println("---------------------------------------");
      artist.printUser();
      artist.printDetails();
      System.out.println("---------------------------------------");

      System.out.print("Enter operator name: ");
      String opName = sc.nextLine();
      System.out.print("Enter operator email: ");
      String opEmail = sc.nextLine();
      System.out.print("Enter Employee number: ");
      String empNo = sc.nextLine();
      System.out.print("Enter Job Title: ");
      String title = sc.nextLine();

      User userOp = new User(opName, opEmail);
      Operator op = new Operator(userOp, Integer.parseInt(empNo), title);
      System.out.println("---------------------------------------");
      op.printUser();
      op.printDetails();
      System.out.println("---------------------------------------");

      System.out.print("Enter Number Of Downloads: ");
      String downloads = sc.nextLine();
      
      System.out.println("---------------------------------------");
      PlayaSong calRev = new PlayaSong();
      calRev.calculateRevenue(artist, Integer.parseInt(downloads));
      
   }

}
