package com.example.demo.Model.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name="prices")
public class Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_brand")
    private Brand brand_id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date start_date;
    @Temporal(TemporalType.TIMESTAMP)
    private Date end_date;
    private Long price_list;
    private Long product_id;
    private Integer priority;
    private Double price;
    private String curr;

    public Prices(Brand brand_id, Date start_date, Date end_date, Long price_list, Long product_id, Integer priority, Double price, String curr) {
        this.brand_id = brand_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.price_list = price_list;
        this.product_id = product_id;
        this.priority = priority;
        this.price = price;
        this.curr = curr;
    }
}
