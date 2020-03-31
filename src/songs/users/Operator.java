package songs.users;

public class Operator extends User {

    private int empNo;
    private String jobTitle;
    private User user;

    public Operator(User user, int empNo, String jobTitle) {
        super(user);
        this.user = user;
        this.jobTitle = jobTitle;
        this.empNo = empNo;
    }

    @Override
    public void printDetails() {
        System.out.println("name : " + user.name);
        System.out.println("name : " + user.email);
        System.out.println("name : " + this.empNo);
        System.out.println("name : " + this.jobTitle);
    }
}
