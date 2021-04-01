package com.example.servingwebcontent.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity

public class Delivery
{
    @Id
    @Column
    private int id;
    @Column
    private int staff_id;
    @Column
    private int order_id;
    @Column
    private String datetime;

}