package org.cc.creativecornerapi.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;

@Entity
@Table(name = "buyer")
public class Buyer {
    @Id
    @Column(name = "buyer_id", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "buyer_id", nullable = false)
    private User user;

    @Column(name = "first_name", nullable = false, length = 64)
    private String firstName;

    @Column(name = "middle_name", nullable = false, length = 64)
    private String middleName;

    @Column(name = "last_name", nullable = false, length = 64)
    private String lastName;

    @OneToMany(mappedBy = "buyer")
    private List<Transaction> transactions;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}