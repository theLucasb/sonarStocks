package com.stocks.stocks.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "stocks")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "market_cap")
    private Long marketCap;
    @Column(name = "stock_symbol")
    private String stockSymbol;
    @Column(name = "stock_name")
    private String stockName;
    @Column(name = "ask_min")
    private Double askMin;
    @Column(name = "ask_max")
    private Double askMax;
    @Column(name = "bid_min")
    private Double bidMin;
    @Column(name = "bid_max")
    private Double bidMax;
    @UpdateTimestamp
    @Column(name = "created_on")
    private Timestamp createdOn;
    @UpdateTimestamp
    @Column(name = "updated_on")
    private Timestamp updatedOn;

    public Stock() {
        this.createdOn = Timestamp.valueOf(LocalDateTime.now());
        this.updatedOn = Timestamp.valueOf(LocalDateTime.now());
    }

}
