package javabased.autowire;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class User {
    private String username;
    private String password;
    @Autowired
    private Group group;

    public User() {

    }

//    @Autowired
//    public User(Group group) {
//        this.group = group;
//    }


    public User(String username, String password, Group group) {
        this.username = username;
        this.password = password;
        this.group = group;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Group getGroup() {
        return group;
    }

//    @Autowired
    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", group=" + group +
                '}';
    }
}
