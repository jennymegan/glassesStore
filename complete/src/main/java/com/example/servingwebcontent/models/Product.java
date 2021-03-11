package com.example.servingwebcontent.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product
{
    private int id;
    private String name;
    private String description;
    private double price;
    private int category;
}
