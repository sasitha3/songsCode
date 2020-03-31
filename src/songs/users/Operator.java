/**
M C K Wijesuriya 
IT15127556
Prorata
 */
package songs.users;

public class Operator extends User implements UserDetails{

    private int empNo;
    private String jobTitle;
    private User user;

    public Operator(User user, int empNo, String jobTitle) {
        super(user);
        this.jobTitle = jobTitle;
        this.empNo = empNo;
    }

    public void printDetails() {
        System.out.println("Employee Number : " + this.empNo);
        System.out.println("Job Title : " + this.jobTitle);
//        user = new User(user);
//        user.printUser();
    }
}
