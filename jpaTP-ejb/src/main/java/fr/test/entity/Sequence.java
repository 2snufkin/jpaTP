package fr.test.entity;
import javax.persistence.*;
import java.io.Serializable;
//Sequence ID
@Entity
@Table(name="sequenceGnr")
public class Sequence implements Serializable {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int ID;
    @Column (name="first_name", length =20, nullable = false)
    private String name;
    @Column (name="last_name", length =50, nullable = false)
    private String lastName;
    @Column (name="emailadress", length =100, nullable = true)
    private String email;
    private boolean isMember;

    //getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }
}


