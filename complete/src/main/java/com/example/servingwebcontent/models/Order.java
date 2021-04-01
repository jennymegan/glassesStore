package com.example.servingwebcontent.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity

public class Order
{
    @Id
    @Column
    private int id;
    @Column
    private int customer_id;
    @Column
    private String date_placed;
    @Column
    private double total_price;
    @Column
    private int delivery_co_id;

}