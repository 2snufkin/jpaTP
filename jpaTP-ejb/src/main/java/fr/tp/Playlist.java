package fr.tp;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table (name ="playlist")
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "playlist_id")
    private Long id;
    private String name;
    private int duration;
    @OneToMany
    @JoinColumn(name = "song_id")
    private Set<SongEntity> song;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public SongEntity getSong() {
        return songEntity;
    }

    public void setSong(SongEntity songEntity) {
        this.songEntity = songEntity;
    }
}
