package org.cc.creativecornerapi.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@Entity
@Table(name = "artist")
public class Artist {
    @Id
    @Column(name = "artist_id", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "artist_id", nullable = false)
    private User user;

    @Column(name = "pen_name", nullable = false, length = 64)
    private String penName;

    @Lob
    @Column(name = "intro", nullable = false)
    private String intro;

    @OneToMany(mappedBy = "artist")
    private List<Artwork> artworks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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