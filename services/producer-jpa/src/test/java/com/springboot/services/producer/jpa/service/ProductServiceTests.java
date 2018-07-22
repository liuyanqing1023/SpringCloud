package com.springboot.services.producer.jpa.service;

import com.springboot.services.producer.jpa.entity.po.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTests {
    @Autowired
    private IProductService productService;

    @Test
    public void add() throws Exception {
        Product product = new Product("海报", "我是海报");
        Assert.assertEquals(1, productService.add(product));
    }

}