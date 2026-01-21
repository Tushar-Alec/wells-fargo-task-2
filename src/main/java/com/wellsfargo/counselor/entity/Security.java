package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private Long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Category;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal purchasePrice;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    @Column(nullable = false)
    private Integer quantity;

    protected Security() {

    }

    public Security(Portfolio portfolio,String Name, String Category, BigDecimal purchasePrice, LocalDateTime creationDate, Integer quantity) {
        this.portfolio = portfolio;
        this.Name = Name;
        this.Category = Category;
        this.purchasePrice = purchasePrice;
        this.creationDate = creationDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() { return securityId; }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {
        return Name;
    }
    public void setName(String lastName) {
        this.Name = Name;
    }

    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        this.Category = category;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }
    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

}
