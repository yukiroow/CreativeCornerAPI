package org.cc.creativecornerapi.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name="user")
public class User {

    @Id
    private int userId;
    private String username;
    private String password;
    private Date joinDate;
    private String uType;
    private String status;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Artist> artists;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Buyer> buyers;

    public User() {
        super();
    }

    public User(int userId, String username, String password, Date joinDate, String uType, String status) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.joinDate = joinDate;
        this.uType = uType;
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getuType() {
        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
