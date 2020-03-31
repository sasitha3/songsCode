package songs.users;

public abstract class User {

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

    public abstract void printDetails();
}
