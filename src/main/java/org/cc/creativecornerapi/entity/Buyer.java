package org.cc.creativecornerapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="buyer")
public class Buyer {

    @OneToOne
    private User user;

    @Id
    private int buyerId = user.getUserId();

    private String firstName;
    private String middleName;
    private String lastName;

    public Buyer() {
        super();
    }

    public Buyer(String lastName, String middleName, String firstName, User user) {
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
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
