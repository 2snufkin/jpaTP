package fr.tp;

import javax.persistence.*;

public class DJ {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dj_id")
    private Long id;
    private String email;
    private String password;
    private String name;
    private String adress;
    @ManyToOne
    @JoinColumn(name="Fk", nullable=false)
    private Playlist playlist;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
}
