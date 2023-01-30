package com.example.demo.Dto;

import com.example.demo.Model.Entity.Brand;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
public class RequestParams {
    private Date start_date;
    private Date end_date;
    private Long product_id;
    private Long brand_id;

    public RequestParams() {

    }
}
