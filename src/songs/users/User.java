/**
M C K Wijesuriya 
IT15127556
Prorata
 */
package songs.users;

public class User implements UserDetails{

    public String name;
    public String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(User user) {
        this.name = user.name;
        this.email = user.email;
    }

//    public void printDetails();

   @Override
   public void printUser() {
      
      System.out.println("name        : " + name);
      System.out.println("email       : " + email);
      
   }
}
