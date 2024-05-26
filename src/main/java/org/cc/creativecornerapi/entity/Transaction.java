package org.cc.creativecornerapi.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @Column(name = "transaction_id", nullable = false)
    private Integer id;

    @Column(name = "date_purchased", nullable = false)
    private LocalDate datePurchased;

    @ManyToOne(optional = false)
    @JoinColumn(name = "buyer_id", nullable = false)
    private Buyer buyer;

    @OneToOne(optional = false)
    @JoinColumn(name = "artwork_id", nullable = false)
    private Artwork artwork;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(LocalDate datePurchased) {
        this.datePurchased = datePurchased;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Artwork getArtwork() {
        return artwork;
    }

    public void setArtwork(Artwork artwork) {
        this.artwork = artwork;
    }

}