package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column
    private LocalDateTime creationDate;

    protected Portfolio(){

    }


    public Portfolio(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() { return portfolioId; }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(LocalDateTime creationDate){
        this.creationDate = creationDate;
    }
}