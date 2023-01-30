package com.example.demo.Model.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="brand")
public class Brand {
    @Id
    private Long id_brand;
    private String description;
    @Transient
    @JsonManagedReference
    @OneToMany(mappedBy = "brand_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Prices> prices;
}
