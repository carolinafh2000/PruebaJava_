package com.example.demo.Service;

import com.example.demo.Dto.RequestParams;
import com.example.demo.Exception.NotFoundException;
import com.example.demo.Model.Entity.Prices;
import com.example.demo.Model.Repository.PricesRepository;
import com.example.demo.Wrapper.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CommerceService {

    @Autowired
    PricesRepository pricesRepository;

    public List<Prices> getProducts(){
        return pricesRepository.findAll();
    }

    public List<Prices> getByParams(RequestParams params)
    {
        if(!pricesRepository.existsById(params.getProduct_id()))
            throw new NotFoundException("El registro no existe");
        return pricesRepository.findPriceByParams(params);
    }

    public List<Response> mapResponse(List<Prices> prices)
    {
        Response res = new Response();
        List<Response> response = new ArrayList<>();
        for (int i = 0; i < prices.size(); i++) {
            res.setProduct_id(prices.get(i).getProduct_id());
            res.setId_brand(prices.get(i).getBrand_id().getId_brand());
            res.setPrice_list(prices.get(i).getPrice_list());
            res.setStart_date(prices.get(i).getStart_date());
            res.setEnd_date(prices.get(i).getEnd_date());
            res.setPrice(prices.get(i).getPrice());
            response.add(res);
        }
        return response;
    }
}
