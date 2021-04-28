package com.example.servingwebcontent.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table

public class Delivery_Staff
{
    @Id
    @Column
    private int id;
    @Column
    private int company_id;
    @Column
    private String name;

}