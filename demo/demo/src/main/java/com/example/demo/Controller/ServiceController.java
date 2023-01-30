package com.example.demo.Controller;

import com.example.demo.Dto.RequestParams;
import com.example.demo.Model.Entity.Prices;
import com.example.demo.Service.CommerceService;
import com.example.demo.Wrapper.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RequestMapping("commerce")
@RestController
public class ServiceController {

    @Autowired
    CommerceService commerceService;

    @GetMapping("/listProduct")
    public ResponseEntity<List<Prices>> listProducts(){
        List<Prices> list = commerceService.getProducts();
        return new ResponseEntity<List<Prices>>(list, HttpStatus.OK);
    }
    @GetMapping("/listProducts")
    public ResponseEntity<List<Response>> listByParams(@RequestParam("start_date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date start_date, @RequestParam("end_date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date end_date, @RequestParam ("product_id") Long product_id, @RequestParam("brand_id") Long brand_id){
        RequestParams params = new RequestParams(start_date, end_date, product_id, brand_id);
        List<Prices> prices = commerceService.getByParams(params);
        List<Response> response = commerceService.mapResponse(prices);
        System.out.println("---------------------------");
        System.out.println(prices);
        return new ResponseEntity<List<Response>>(response, HttpStatus.OK);
    }

}
