package com.example.demo.Model.Repository;

import com.example.demo.Dto.RequestParams;
import com.example.demo.Model.Entity.Prices;
import com.example.demo.Wrapper.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PricesRepository extends JpaRepository<Prices, Long> {
    @Query("select p from Prices p where p.start_date = :#{#prices.start_date} and p.end_date = :#{#prices.end_date} and p.product_id = :#{#prices.product_id} and p.brand_id.id = :#{#prices.brand_id}")
    List<Prices> findPriceByParams(@Param("prices") RequestParams prices);
}