package fr.relations;

import javax.persistence.*;

@Entity
@Table(name="adress_rlt")

public class AdressRelat {
    @Id
    @Column(name="adress_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String street;
    private String city;
    private String zip;
    private String country;



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
