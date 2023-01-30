package com.example.demo.TestCase;

import com.example.demo.Dto.RequestParams;
import com.example.demo.Model.Entity.Brand;
import com.example.demo.Model.Entity.Prices;
import com.example.demo.Service.CommerceService;
import com.example.demo.Wrapper.Response;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@WebMvcTest(RestController.class)
//@ContextConfiguration(classes = ApplicationMock.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class CommerceTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CommerceService commerceService;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    @Test
    void getPricesTest1() throws Exception {

        RequestParams mockRequest = new RequestParams();
        mockRequest.setStart_date(sdf.parse("2023-01-14T10:00:00-05:00"));
        mockRequest.setEnd_date(sdf.parse("2024-01-14T10:00:00-05:00"));
        mockRequest.setProduct_id(35455L);
        mockRequest.setBrand_id(1L);

        LinkedList<Response> mockResponse = mock(LinkedList.class);
        Response response = new Response();
        response.setProduct_id(35455L);
        response.setId_brand(1L);
        response.setPrice_list(1L);
        response.setStart_date(sdf.parse("2023-01-14T10:00:00-05:00"));
        response.setEnd_date(sdf.parse("2024-01-14T10:00:00-05:00"));
        response.setPrice(35.5);
        mockResponse.add(response);

        LinkedList<Prices> mockPrices = mock(LinkedList.class);
        Prices prices = new Prices();
        Brand brand = new Brand();
        brand.setId_brand(1L);
        prices.setId(1L);
        prices.setStart_date(sdf.parse("2023-01-14T10:00:00-05:00"));
        prices.setEnd_date(sdf.parse("2024-01-14T10:00:00-05:00"));
        prices.setPrice_list(1L);
        prices.setProduct_id(35455L);
        prices.setPriority(0);
        prices.setPrice(35.5);
        prices.setCurr("EUR");
        prices.setBrand_id(brand);
        mockPrices.add(prices);

        Mockito.when(commerceService.getByParams(mockRequest)).thenReturn(mockPrices);
        Mockito.when(commerceService.mapResponse(mockPrices)).thenReturn(mockResponse);

        mockMvc.perform(get("/commerce/listProducts")
                .param("start_date", "2023-01-14T10:00:00-05:00")
                .param("end_date", "2024-01-14T10:00:00-05:00")
                .param("product_id", "35555")
                .param("brand_id", "1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    void getPricesTest2() throws Exception {

        RequestParams mockRequest = new RequestParams();
        mockRequest.setStart_date(sdf.parse("2023-01-14T16:00:00-05:00"));
        mockRequest.setEnd_date(sdf.parse("2024-01-14T16:00:00-05:00"));
        mockRequest.setProduct_id(35455L);
        mockRequest.setBrand_id(1L);

        LinkedList<Response> mockResponse = mock(LinkedList.class);
        Response response = new Response();
        response.setProduct_id(35455L);
        response.setId_brand(1L);
        response.setPrice_list(1L);
        response.setStart_date(sdf.parse("2023-01-14T16:00:00-05:00"));
        response.setEnd_date(sdf.parse("2024-01-14T16:00:00-05:00"));
        response.setPrice(35.5);
        mockResponse.add(response);

        LinkedList<Prices> mockPrices = mock(LinkedList.class);
        Prices prices = new Prices();
        Brand brand = new Brand();
        brand.setId_brand(1L);
        prices.setId(1L);
        prices.setStart_date(sdf.parse("2023-01-14T16:00:00-05:00"));
        prices.setEnd_date(sdf.parse("2024-01-14T16:00:00-05:00"));
        prices.setPrice_list(1L);
        prices.setProduct_id(35455L);
        prices.setPriority(0);
        prices.setPrice(35.5);
        prices.setCurr("EUR");
        prices.setBrand_id(brand);
        mockPrices.add(prices);

        Mockito.when(commerceService.getByParams(mockRequest)).thenReturn(mockPrices);
        Mockito.when(commerceService.mapResponse(mockPrices)).thenReturn(mockResponse);

        mockMvc.perform(get("/commerce/listProducts")
                        .param("start_date", "2023-01-14T16:00:00-05:00")
                        .param("end_date", "2024-01-14T16:00:00-05:00")
                        .param("product_id", "35555")
                        .param("brand_id", "1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    void getPricesTest3() throws Exception {

        RequestParams mockRequest = new RequestParams();
        mockRequest.setStart_date(sdf.parse("2023-01-14T21:00:00-05:00"));
        mockRequest.setEnd_date(sdf.parse("2024-01-14T21:00:00-05:00"));
        mockRequest.setProduct_id(35455L);
        mockRequest.setBrand_id(1L);

        LinkedList<Response> mockResponse = mock(LinkedList.class);
        Response response = new Response();
        response.setProduct_id(35455L);
        response.setId_brand(1L);
        response.setPrice_list(1L);
        response.setStart_date(sdf.parse("2023-01-14T21:00:00-05:00"));
        response.setEnd_date(sdf.parse("2024-01-14T21:00:00-05:00"));
        response.setPrice(35.5);
        mockResponse.add(response);

        LinkedList<Prices> mockPrices = mock(LinkedList.class);
        Prices prices = new Prices();
        Brand brand = new Brand();
        brand.setId_brand(1L);
        prices.setId(1L);
        prices.setStart_date(sdf.parse("2023-01-14T21:00:00-05:00"));
        prices.setEnd_date(sdf.parse("2024-01-14T21:00:00-05:00"));
        prices.setPrice_list(1L);
        prices.setProduct_id(35455L);
        prices.setPriority(0);
        prices.setPrice(35.5);
        prices.setCurr("EUR");
        prices.setBrand_id(brand);
        mockPrices.add(prices);

        Mockito.when(commerceService.getByParams(mockRequest)).thenReturn(mockPrices);
        Mockito.when(commerceService.mapResponse(mockPrices)).thenReturn(mockResponse);

        mockMvc.perform(get("/commerce/listProducts")
                        .param("start_date", "2023-01-14T21:00:00-05:00")
                        .param("end_date", "2024-01-14T21:00:00-05:00")
                        .param("product_id", "35555")
                        .param("brand_id", "1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    void getPricesTest4() throws Exception {

        RequestParams mockRequest = new RequestParams();
        mockRequest.setStart_date(sdf.parse("2023-01-15T10:00:00-05:00"));
        mockRequest.setEnd_date(sdf.parse("2024-01-15T10:00:00-05:00"));
        mockRequest.setProduct_id(35455L);
        mockRequest.setBrand_id(1L);

        LinkedList<Response> mockResponse = mock(LinkedList.class);
        Response response = new Response();
        response.setProduct_id(35455L);
        response.setId_brand(1L);
        response.setPrice_list(1L);
        response.setStart_date(sdf.parse("2023-01-15T10:00:00-05:00"));
        response.setEnd_date(sdf.parse("2024-01-15T10:00:00-05:00"));
        response.setPrice(35.5);
        mockResponse.add(response);

        LinkedList<Prices> mockPrices = mock(LinkedList.class);
        Prices prices = new Prices();
        Brand brand = new Brand();
        brand.setId_brand(1L);
        prices.setId(1L);
        prices.setStart_date(sdf.parse("2023-01-15T10:00:00-05:00"));
        prices.setEnd_date(sdf.parse("2024-01-15T10:00:00-05:00"));
        prices.setPrice_list(1L);
        prices.setProduct_id(35455L);
        prices.setPriority(0);
        prices.setPrice(35.5);
        prices.setCurr("EUR");
        prices.setBrand_id(brand);
        mockPrices.add(prices);

        Mockito.when(commerceService.getByParams(mockRequest)).thenReturn(mockPrices);
        Mockito.when(commerceService.mapResponse(mockPrices)).thenReturn(mockResponse);

        mockMvc.perform(get("/commerce/listProducts")
                        .param("start_date", "2023-01-15T10:00:00-05:00")
                        .param("end_date", "2024-01-15T10:00:00-05:00")
                        .param("product_id", "35555")
                        .param("brand_id", "1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    void getPricesTest5() throws Exception {

        RequestParams mockRequest = new RequestParams();
        mockRequest.setStart_date(sdf.parse("2023-01-16T21:00:00-05:00"));
        mockRequest.setEnd_date(sdf.parse("2024-01-16T21:00:00-05:00"));
        mockRequest.setProduct_id(35455L);
        mockRequest.setBrand_id(1L);

        LinkedList<Response> mockResponse = mock(LinkedList.class);
        Response response = new Response();
        response.setProduct_id(35455L);
        response.setId_brand(1L);
        response.setPrice_list(1L);
        response.setStart_date(sdf.parse("2023-01-16T21:00:00-05:00"));
        response.setEnd_date(sdf.parse("2024-01-16T21:00:00-05:00"));
        response.setPrice(35.5);
        mockResponse.add(response);

        LinkedList<Prices> mockPrices = mock(LinkedList.class);
        Prices prices = new Prices();
        Brand brand = new Brand();
        brand.setId_brand(1L);
        prices.setId(1L);
        prices.setStart_date(sdf.parse("2023-01-16T21:00:00-05:00"));
        prices.setEnd_date(sdf.parse("2024-01-16T21:00:00-05:00"));
        prices.setPrice_list(1L);
        prices.setProduct_id(35455L);
        prices.setPriority(0);
        prices.setPrice(35.5);
        prices.setCurr("EUR");
        prices.setBrand_id(brand);
        mockPrices.add(prices);

        Mockito.when(commerceService.getByParams(mockRequest)).thenReturn(mockPrices);
        Mockito.when(commerceService.mapResponse(mockPrices)).thenReturn(mockResponse);

        mockMvc.perform(get("/commerce/listProducts")
                        .param("start_date", "2023-01-16T21:00:00-05:00")
                        .param("end_date", "2024-01-16T21:00:00-05:00")
                        .param("product_id", "35555")
                        .param("brand_id", "1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

}
