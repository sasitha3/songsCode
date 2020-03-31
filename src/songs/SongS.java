/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
      String name   = sc.nextLine();
      System.out.print("Enter artist email: ");
      String email  = sc.nextLine();
      System.out.print("Enter Number of songs: ");
      String NoOfSongs = sc.nextLine();
      System.out.print("Enter type: ");
      String type   = sc.nextLine();
      System.out.print("Do you want add a song: ");
      String sng    = sc.nextLine();
      List<songs.users.Song> songs = new ArrayList<>();
      while (sng.equalsIgnoreCase("y")){
         
         System.out.print("Enter song: ");
         String song = sc.nextLine();
         System.out.print("Enter rate: ");
         String rate = sc.nextLine();
         System.out.print("Do you want add another song: ");
         sng = sc.nextLine();
      }
      
   }
   
}
