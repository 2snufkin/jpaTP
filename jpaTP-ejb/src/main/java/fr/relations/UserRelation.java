package fr.relations;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="user_r")
public class UserRelation {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column (name="first_name", length =20, nullable = false)
    private String name;
    @Column (name="last_name", length =50, nullable = false)
    private String lastName;
     @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="adress_idFk", nullable=false)
    private Set<AdressRelat> adressRelats;// Each branch have many Students (list of adresses/set of adresses)


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

    public Set<AdressRelat> getAdressRelats() {
        return adressRelats;
    }

    public void setAdressRelats(Set<AdressRelat> adressRelats) {
        this.adressRelats = adressRelats;
    }
}



