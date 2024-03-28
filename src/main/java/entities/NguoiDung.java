package entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "NguoiDung")
public class NguoiDung implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @Column(name = "username")
    private String userName ;
    @Column(name = "pass")
    private String pass;

    public NguoiDung() {
    }

    public NguoiDung(Integer ID, String userName, String pass) {
        this.ID = ID;
        this.userName = userName;
        this.pass = pass;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
