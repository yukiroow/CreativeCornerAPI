package org.cc.creativecornerapi.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id", nullable = false)
    private Integer id;

    @Column(name = "username", nullable = false, length = 16)
    private String username;

    @Column(name = "password", nullable = false, length = 16)
    private String password;

    @Column(name = "join_date", nullable = false)
    private LocalDate joinDate;

    @Column(name = "u_type", nullable = false)
    private char uType;

    @Column(name = "status", nullable = false, length = 10)
    private String status;

    @OneToOne(mappedBy = "user")
    private Buyer buyer;

    @OneToOne(mappedBy = "user")
    private Artist artist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public char getUType() {
        return uType;
    }

    public void setUType(char uType) {
        this.uType = uType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}