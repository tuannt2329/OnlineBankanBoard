package rubikteam.kanban.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "users")
public class User implements Serializable {

    public User() {
    }

    public User(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    @Id
    private  String username;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    private  String pass;


}