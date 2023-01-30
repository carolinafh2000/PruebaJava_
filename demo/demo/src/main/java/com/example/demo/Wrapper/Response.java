package com.example.demo.Wrapper;

import com.example.demo.Model.Entity.Brand;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
public class Response {
    private Long product_id;
    private Long id_brand;
    private Long price_list;
    @Temporal(TemporalType.TIMESTAMP)
    private Date start_date;
    @Temporal(TemporalType.TIMESTAMP)
    private Date end_date;
    private Double price;
    public Response() {

    }
}
