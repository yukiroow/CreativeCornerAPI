package org.cc.creativecornerapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="artist")
public class Artist {

    @OneToOne
    private User user;
    @Id
    private int artistId = user.getUserId();
    private String penName;
    private String intro;

    public Artist() {
        super();
    }

    public Artist(User user, String penName, String intro) {
        this.user = user;
        this.penName = penName;
        this.intro = intro;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
