package com.example.servingwebcontent.controllers;
import com.example.servingwebcontent.models.Product;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class ProductController
{

    private static final Logger logger= LoggerFactory.getLogger(com.example.servingwebcontent.controllers.ProductController.class);

    @PostMapping("/product")
    private String product(@RequestBody Product product) {
        logger.info("---Post Request Sent:" + product.toString());
        return "greeting";
    }

    @GetMapping("/product")
    public String product() {
        //get all products from db
        return "greeting";
    }


}
