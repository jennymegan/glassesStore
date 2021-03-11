package com.example.servingwebcontent.controllers;
import com.example.servingwebcontent.models.Product;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BluelightGlassesController
{

    private static final Logger logger= LoggerFactory.getLogger(com.example.servingwebcontent.controllers.ProductController.class);

    @PostMapping("/bluelightglasses")
    private String product(@RequestBody Product product) {
        logger.info("---Post Request Sent:" + product.toString());
        return "greeting";
    }

    @GetMapping(value="/bluelightglasses", produces = MediaType.APPLICATION_JSON_VALUE)
    public String product() {
        //get all products from db
        return "{ \"glasses\": \"bluelight\" }";
    }
