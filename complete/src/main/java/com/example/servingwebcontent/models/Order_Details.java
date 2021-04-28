package com.example.servingwebcontent.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table

public class Order_Details
{
    @Id
    @Column
    private int id;
    @Column
    private int book_id;
    @Column
    private int qty;
    @Column
    private int order_id;


}